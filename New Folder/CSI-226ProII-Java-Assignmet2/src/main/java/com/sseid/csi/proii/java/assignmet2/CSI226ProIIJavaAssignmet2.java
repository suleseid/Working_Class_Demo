
Import java.util.ArrayList;
Import java.util.Scanner;
public class Player
{
    private String name;
    private int number;
 
    public Player(String name, int number)
    {
        
        this.name = name;
        this .number = number;     
    }
     
     public String getName()
     {
        return name; 
     }
     public int getNumber()
     {
         return number;
     }
}
public class Main
{
   public static void main(String Scanner, String[] args)
    {  
        Scanner scanner = new Scanner(System.int)
        ArreyList<Player> players = new ArreyList<>();
        
       //We have to list 5 Players with number
        players.Add(new Player("Player0", 7));
        players.Add(new Player("Player1", 10));
        players.Add(new Player("Player2", 5));
        players.Add(new Player("Player3", 11));
        players.Add(new Player("Player4", 3));
        
       while(true)
        {
            System.out.println("\n Menu:");
            System.out.println("0.displey all Players");
            System.out.println("1.Displey players with odd numbers:");
            System.out.println("2.Despley Players with names that start with a letter c:");
            System.out.println("3.Add a player:");
            System.out.println("4.Exit:");
            System.out.println("Enter your choise");

             int choice = scanner.nextInt();
           
           switch (choice) 
            {
               case 0:
                    displayAllPlayers(players);
                    break;
                case 1:
                    displayPlayersWithOddNumbers(players);
                    break;
                case 2:
                    displayPlayersWithNamesStartingWithLetter(players, scanner);
                    break;
                case 3:
                    addPlayer(players, scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
            }        System.out.println("Invalid choice. Please try again.");     
        }
        
    }   

 public static void displayAllPlayers(ArrayList<Player> players) 
    {
        System.out.println("All Players:");
        for (Player player : players) 
        {
            System.out.println(player.getName());
        } 
    }

 public static void displayPlayersWithOddNumbers(ArrayList<Player> players) 
    {
        System.out.println("Players with Odd Numbers:");
        for (Player player : players) 
        {
            if (player.getNumber()% 2 != 0)
            {
                System.out.println(player.getName());
            }
        }
    }
 public static void displayPlayersWithNamesStartingWithLetter(ArrayList<Player> players, Scanner scanner) 
    {
        System.out.print("Enter a letter to filter players: ");
        char letter = scanner.next().charAt(0);

        System.out.println("Players with names starting with '" + letter + "':");
        for (Player player : players) 
        {
            if (player.getName().toLowerCase().charAt(0) == Character.toLowerCase(letter)) 
            {
                System.out.println(player.getName());
            }
        }
    }
 public static void addPlayer(Arraylist<Player> players, Scanner scanner) 
    {
        System.out.print("Enter the player's name: ");
        String name = scanner.next();
        System.out.print("Enter the player's number: ");
        int number = scanner.nextInt();

        players.add(new Player(name, number));
        System.out.println("Player added successfully!");
    }  
}


