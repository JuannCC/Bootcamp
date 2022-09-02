from msilib.schema import Class
from django.db import models

# Create your models here.
class Employee(models.Model):
    id_number= models.CharField(max_length=10, blank=False, null=False)
    name=models.CharField(max_length=10, blank=False, null=False)
    last_name=models.CharField(max_length=10, blank=False, null=False)
    email=models.EmailField(max_length=10, blank=False, null=False)
    address=models.Char(max_length=30, blank=False, null=False)

    def __str__(self):
        return self.name

class Job(models.Model):
    title= models.CharField(max_length=15, blank=False, null=False)
    description= models.TextField(null=True)

    def __str__(self):
        return self.title

class Salary(models.Model):
    amount= models.IntegerField(blank=False, null=False)
    extra_dec= models.BooleanField(default=False)
    extra_jun= models.BooleanField(default=False)

    def __str__(self):
        return self.amount

class Place(models.Model):
    name=models.CharField(max_length=30, blank=False, null=False)
    address=models.CharField(max_length=50, blank=False, null=False)
    zip_code=models.CharField(max_length=5, blank=False, null=False)

    def __str__(self):
        return self.name

class Location(models.Model):
    name=models.CharField(max_length=30, blank=False, null=False)

    def __str__(self):
        return self.name

class Country(models.Model):
    name=models.CharField(max_length=15, blank=False, null=False)
    contry_code=models.CharField(max_length=6, blank=False, null=False)

    def __str__(self):
        return self.name
