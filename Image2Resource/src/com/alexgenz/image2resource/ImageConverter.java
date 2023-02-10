package com.alexgenz.image2resource;

import javax.swing.*;
import java.awt.*;

public class ImageConverter {

    /**
     * Imports an image from inside the project, converts it into a project resource,
     * and scales it according to the introduced parameters. Use for square images.
     * @param imagePath File path of the desired image, relative to the project
     * @param squareSize Resolution in pixels of the image, given the image shares the same width and height resolution
     *                   due to being a square image
     * @return the image imported as a resource and formatted according to the user needs
     */
    public static Image formatImage(String imagePath, int squareSize) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(squareSize, squareSize, Image.SCALE_DEFAULT);

        return formattedImage;

    }

    /**
     * Imports an image from inside the project, converts it into a project resource,
     * and scales it according to the introduced parameters.
     * @param imagePath File path of the desired image, relative to the project
     * @param width Resolution in pixels of the image's width
     * @param height Resolution in pixels of the image's height
     * @return the image imported as a resource and formatted according to the user needs
     */
    public static Image formatImage(String imagePath, int width, int height) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);

        return formattedImage;

    }

    /**
     * Imports an image from inside the project, converts it into a project resource,
     * and scales it according to the introduced parameters, and allows to use different scaling algorithms.
     * Use for square images.
     * @param imagePath File path of the desired image, relative to the project
     * @param squareSize Resolution in pixels of the image, given the image shares the same width and height resolution
     *                   due to being a square image
     * @param scaling Scaling algorithm required for the formatting to work and to either smooth large images
     *               or avoid blur in low resolution pictures
     * @return the image imported as a resource and formatted according to the user needs
     */
    public static Image formatImage(String imagePath, int squareSize, byte scaling) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(squareSize, squareSize, scaling);

        return formattedImage;

    }

    /**
     * Imports an image from inside the project, converts it into a project resource,
     * and scales it according to the introduced parameters, and allows to use different scaling algorithms.
     * @param imagePath File path of the desired image, relative to the project
     * @param width Resolution in pixels of the image's width
     * @param height Resolution in pixels of the image's height
     * @param scaling Scaling algorithm required for the formatting to work and to either smooth large images
     *               or avoid blur in low resolution pictures
     * @return the image imported as a resource and formatted according to the user needs
     */
    public static Image formatImage(String imagePath, int width, int height, byte scaling) {
        ImageIcon inputImage = new ImageIcon(ImageConverter.class.getResource(imagePath));
        Image formattedImage = inputImage.getImage().getScaledInstance(width, height, scaling);

        return formattedImage;

    }

}
