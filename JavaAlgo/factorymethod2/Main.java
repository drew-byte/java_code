class Main { 

    public static void main(String[] args) {
        
        Dialog dialogA = new WindowsDialog();
        Button okButton1 = dialogA.createButton();
        okButton1.render();

        Dialog dialogB = new WebDialog();
        Button okButton2 = dialogB.createButton();
        okButton2.render();
    }
}