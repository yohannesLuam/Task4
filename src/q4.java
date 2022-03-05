public class q4 {
    public static void main(String[] args) {
        int amountOfBricks = 51;
        int containerCapacity = 8;
        int fullContainers;
        int bricksInUnfilledContainer;
        int totalContainers;

        //Amount of full containers
        fullContainers = amountOfBricks / containerCapacity;
        System.out.println("We have " + fullContainers + " full containers.");

        //Total number of containers is full containers plus unfilled container which is 1
        totalContainers = fullContainers + 1;
        System.out.println("We have " + totalContainers + " containers in total.");

        //Number of bricks in the unfilled container
        bricksInUnfilledContainer = amountOfBricks % containerCapacity;
        System.out.println("The unfilled container has " + bricksInUnfilledContainer + " bricks.");


    }
}
