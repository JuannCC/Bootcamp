# Generated by Django 4.0.4 on 2022-05-19 17:46

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('catalog', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Directores',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(help_text='Pon el nombre del genero', max_length=64)),
            ],
        ),
        migrations.CreateModel(
            name='Peliculas',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.CharField(max_length=32)),
                ('summary', models.TextField(help_text='De que va la pelicula?', max_length=100)),
                ('isbn', models.CharField(max_length=13, verbose_name='ISBN')),
            ],
        ),
        migrations.DeleteModel(
            name='Film',
        ),
        migrations.DeleteModel(
            name='Genre',
        ),
    ]
