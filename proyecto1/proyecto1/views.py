from django.http import HttpResponse
import datetime
from django.template import Template, Context

class Persona(object):

    def __init__(self,nombre,apellido):
        self.nombre=nombre
        self.apellido=apellido

def saludo(request):
    p1=Persona("Juan","Crotta")

    #nombre= "Juan"
    ahora=datetime.datetime.now()

    doc_externo=open("/Users/juancruzcrotta/programacion/django/proyecto1/proyecto1/plantillas/miplantilla.html")
    plt=Template(doc_externo.read())
    doc_externo.close()

    ctx=Context({"nombre_persona":p1.nombre,"apellido_persona":p1.apellido,"fecha":ahora})
    documento=plt.render(ctx)
    return HttpResponse(documento)

def despedida(request):
    return HttpResponse("Hasta luego")

def damefecha(request):
    fecha_actual=datetime.datetime.now()
    documento="""<html>
    <body>
    <h1>
    Fecha y hora actual: %s 
    </h1>
    <body>
    <html>""" %fecha_actual

    return HttpResponse(documento)

def calculaedad(request,edad,agno):
    #edadActual=18
    periodo=agno-2022
    edadFutura=edad+periodo
    documento="<html><body><h2>En el año %s tendras %s años" %(agno,edadFutura)
    return HttpResponse(documento)
