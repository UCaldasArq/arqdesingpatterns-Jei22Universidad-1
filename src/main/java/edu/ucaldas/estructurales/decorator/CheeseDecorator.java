package edu.ucaldas.estructurales.decorator;

public class CheeseDecorator extends ProductDecorator {
    public CheeseDecorator(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 2.0; // suma el costo del queso
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", queso";
    }
}
