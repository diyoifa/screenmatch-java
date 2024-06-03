package com.aluracursos.screenmatch.service;

public interface IconvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clazz);
}
