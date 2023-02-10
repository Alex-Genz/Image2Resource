package com.alexgenz.image2resource;

import javax.swing.*;
import java.awt.*;

/**
 * <code>Image2Resource</code> esta pensado para facilitar el proceso de importacion de imágenes e iconos
 * a tu proyecto de Swing como recurso de programa, y hacer que sean visibles tras ser compilado el proyecto.
 * <br>
 * <br>
 * <b>¡IMPORTANTE!</b>
 * <br>
 * La ruta de la imagen tiene que ser relativa al proyecto de java, tiene que empezar por <code>"/"</code>,
 * el directiorio que contiene todos los recursos tiene que estar incluido en el "build path" y no debe ser incluido
 * en la ruta del recurso, y el formato de la ruta debe ser de tipo <code>String</code>
 * <br>
 * Ejemplo: <code>"/image.png"</code> (image.png se encuentra directamente dentro del directorio de recursos)
 *
 * @author Alexandros Genzor Sánchez
 */
public class ImageConverter {

    /**
     * Importa una imágen ubicada dentro del proyecto, la convierte en recurso de proyecto,
     * y la dimensiona acorde a los parametros introducidos.
     * <br>
     * <b>¡IMPORTANTE!</b><br>
     * Solo usar con imágenes cuadradas.
     * @param imagePath Ruta relativa de la imagen deseada
     * @param squareSize Resolución en píxeles de la imágen
     * @return la imágen formateada de acuerdo a los parámetros introducidos
     */
    public static Image formatImage(String imagePath, int squareSize) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(squareSize, squareSize, Image.SCALE_DEFAULT);

        return formattedImage;

    }

    /**
     * Importa una imágen ubicada dentro del proyecto, la convierte en recurso de proyecto,
     * y la dimensiona acorde a los parametros introducidos.
     * @param imagePath Ruta relativa de la imagen deseada
     * @param width Resolución en píxeles del ancho de la imágen
     * @param height Resolución en píxeles del alto de la imágen
     * @return la imágen formateada de acuerdo a los parámetros introducidos
     */
    public static Image formatImage(String imagePath, int width, int height) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);

        return formattedImage;

    }

    /**
     * Importa una imágen ubicada dentro del proyecto, la convierte en recurso de proyecto,
     * y la dimensiona acorde a los parametros introducidos, y haciendo uso de diferentes algoritmos de escalado.
     * <br>
     * <b>¡IMPORTANTE!</b><br>
     * Solo usar con imágenes cuadradas.
     * @param imagePath Ruta relativa de la imagen deseada
     * @param squareSize Resolución en píxeles de la imágen
     * @param scaling Algoritmo de escalado requerido para poder formatear la imágen y
     *                suavizar imágenes de gran resolución o evitar el emborronamiento en imágenes de baja resolución
     * @return la imágen formateada de acuerdo a los parámetros introducidos
     */
    public static Image formatImage(String imagePath, int squareSize, byte scaling) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(squareSize, squareSize, scaling);

        return formattedImage;

    }

    /**
     * Importa una imágen ubicada dentro del proyecto, la convierte en recurso de proyecto,
     * y la dimensiona acorde a los parametros introducidos, y haciendo uso de diferentes algoritmos de escalado.
     * @param imagePath Ruta relativa de la imagen deseada
     * @param width Resolución en píxeles del ancho de la imágen
     * @param height Resolución en píxeles del alto de la imágen
     * @param scaling Algoritmo de escalado requerido para poder formatear la imágen y
     *                suavizar imágenes de gran resolución o evitar el emborronamiento en imágenes de baja resolución
     * @return la imágen formateada de acuerdo a los parámetros introducidos
     */
    public static Image formatImage(String imagePath, int width, int height, byte scaling) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(width, height, scaling);

        return formattedImage;

    }

}
