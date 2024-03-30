 class Main {
    public static void main(String[] args) {
        World world = new World();
        // Initialize the world with rooms
        TextAdventureGame game = new TextAdventureGame();
        game.setWorld(world);
        game.play();
    }
}