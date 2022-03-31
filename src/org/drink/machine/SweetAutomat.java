package org.drink.machine;

public class SweetAutomat {
    private final UserDisplay userDisplay;
    private final ProductStorage<Sweet> productStorage;

    public SweetAutomat() {
        this.userDisplay = new UserDisplay();
        Sweet[] sweets = new Sweet[4];
        sweets[0] = new Sweet("Mars", 1.5, 5);
        sweets[1] = new Sweet("Bounty", 2, 5);
        sweets[2] = new Sweet("Alyonuska", 2, 5);
        sweets[3] = new Sweet("Nuts", 2.65, 5);

        productStorage = new ProductStorage<>(sweets);
    }

    public void work() {
        while (true) {
            showProducts();
            Sweet selectedProduct = selectProduct();
            payProduct(selectedProduct);
            if (!giveProduct(selectedProduct)) break;
        }
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }

    private Sweet selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        return productStorage.getProductByNumber(productNumber);
    }

    private boolean payProduct(Sweet selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPromt(productName, price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return payResult;
    }


    private boolean giveProduct(Sweet selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);
        return result;
    }

    public static void main(String[] args) {
        SweetAutomat sweetAutomat = new SweetAutomat();
        sweetAutomat.work();
    }
}
