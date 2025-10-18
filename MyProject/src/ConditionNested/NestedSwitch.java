package ConditionNested;

public class NestedSwitch {

    // Method utama yang akan diuji oleh NestedSwitchTest.java
    public String getSelection(int categoryCode, int choiceCode) {
        String result;

        switch (categoryCode) {
            case 1: // Drink category atau kategori minuman
                switch (choiceCode) {
                    case 1:
                        result = categoryCode + ", You selected: Tea";
                        break;
                    case 2:
                        result = categoryCode + ", You selected: Coffe";
                        break;
                    default: 
                        result = categoryCode + ", Invalid drink choise";
                        break;

                }
                break;
            
            case 2: // Food category atau kategori makanan
                switch (choiceCode) {
                    case 1:
                        result = categoryCode + ", You selected: Pizza";
                        break;
                    case 2:
                        result = categoryCode + ", You selected: Bueger";
                        break;
                    default:
                        result = categoryCode + ", Invalid food choice";
                        break;

                }
                break;
            
            default:
                // Invalid main category
                result = categoryCode + ", Invalid category";
                break;

        }

        return result;
    }
    
}
