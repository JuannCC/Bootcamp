from django.db import models

# Create your models here.
class Directores(models.Model):
    name= models.CharField(max_length=64,help_text="Pon el nombre del genero")

    def __str__(self):
        return self.name

class Peliculas(models.Model):
    title= models.CharField(max_length=32)
    #author= models.ForeignKey('Author', on_delete=models.SET_NULL, null=True)
    summary = models.TextField(max_length=100, help_text="De que va la pelicula?")
    isbn= models.CharField('ISBN', max_length=13)
    #genre = models.ManyToManyField(Genre)

    def __str__(self):
        return self.title

  #  def get_absolute_url(self):
   #     return reverse('book-detail', args=[str(self.id)])