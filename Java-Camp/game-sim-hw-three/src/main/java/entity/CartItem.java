package entity;

public class CartItem {
    private Game game;
    private Campaign campaign;
    private int amount;
    private double price;


    public CartItem(Game game, Campaign campaign, int amount) {
        this.game = game;
        this.campaign = campaign;
        this.amount = amount;
        price=game.getUnitprice()* campaign.getDiscount()*this.amount;
    }
    public CartItem(Game game,int amount){
        this.campaign=null;
        this.game=game;
        this.amount=amount;
        price= game.getUnitprice()*amount;
    }

    public Game getGame() {
        return game;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;

    }
}
