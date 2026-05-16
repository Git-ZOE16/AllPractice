import java.util.Scanner;

public class Nokia{

    public static void main(String[] args){
    
          Scanner input = new Scanner(System.in);
    
//       MAIN MENU OPTIONS

       String mainMenu=
        """
        main menu
        1. PhoneBook
        2. Messages
        3. Chat
        4. CallRegister
        5. Tones
        6. Settings
        7. CallDivert
        8. Games
        9. Calculator
        10. Reminder
        11. Clock
        12. Profile
        13. SimService
        
        select an option

        """;
       
        
//        PHONE BOOK MENU

      String phonebookMenu = """
        1. Search
        2. Service Nos
        3. Add name
        4. Erase
        5. Edit
        6. Assign tone
        7. Send b'card'
        8. Options
        9. Speed dials
        10. Voice tags
        
        select an option

        """;
        
//        Phonebook Options menu

        String phonebookOptions =
        """
        1. Type of View
        2. Memory Status
        """;
              
        
    //      PHONE MESSAGE MENU
    
      String phonemessageMenu = """
        1. Write Message
        2. Inbox
        3. Outbox
        4. Picture Messages
        5. Template
        6. Simileys
        7. Message Settings
        
        select an option

        """;
        
     // PhoneMessageMenu MessageSettingsOptions
       
        String MessageSettingsOptions =
        """
        1. Set1
        2. Common
        """;  
                // PhoneMessageMenu MessageSettingsOptions Set1
                        
                     String Set1Options =
                     """
                     1. Message Center Number
                     2. Messages Sent as
                     3. Message Validity
                     """;  
          
                // PhoneMessageMenu MessageSettingsOptions Common
                        
                     String CommonOptions =
                     """
                     1. Delivery Reports
                     2. Reply via Same Center
                     3. Character Support
                     """;  
           
    
 //         CHAT MENU
 
      String chatMenu = """
        1. Chat
        
        select

        """;

//        CALL REGISTER MENU

      String callRegisterMenu = """
        1. Missed Calls
        2. Received Calls
        3. Dialled Numbers
        4. Erase Recent Call List
        5. Show Call Durations
        6. Show Call Cost
        7. Call Cost Settings
        8. Prepaid Credit
       
        select an option

        """;
        
       // CallRegisterMenu ShowCallDurationsOptions
       
        String ShowCallDurationsOptions =
        """
        1. Last Call Duration
        2. All Calls Duration
        3. Received Calls Duration
        4. Dialled Calls Duration
        5. Clear Timers
        """;   
        
        // CallRegisterMenu ShowCallCostsOptions
       
        String ShowCallCostOptions =
        """
        1. Last Call Cost
        2. All Calls Cost
        3. Clear Counters
        """;   
        
         // CallRegisterMenu CallCostSettingsOptions
       
        String CallCostSettingsOptions =
        """
        1. Call Cost Limit
        2. Show Costs in
        """;   
             

//        Tones MENU

      String tonesMenu = """
        1. Ringing Tones
        2. Ringing Volume
        3. Incoming call alert
        4. Composer
        5. Message alert tone
        6. Keypad Tones
        7. Warning and game tones
        8. Vibrating alert
        9. Screen Saver
       
        select an option

        """;
        
//        SETTINGS MENU

      String settingsMenu = """
        1. Call Settings
        2. Phone Settings
        3. Security Settings
        4. Restore Factory Settings
        
        select an option

        """;


//        CALL DIVERT MENU

      String callDivertMenu = """
        1. Call Divert
        
        select

        """;


//        GAMES MENU

      String gamesMenu = """
        1. Games 
        
        select

        """;

//        CALCULATOR MENU

      String calculatorMenu = """
        1. Calculator 
        
        select

        """;


//        REMINDER MENU

      String reminderMenu = """
        1. Reminder 
        
        select

        """;
        

//        CLOCK MENU
      String clockMenu = """
        1. Alarm Clock
        2. Clock Settings
        3. Date Setting
        4. Stopwatch
        5. Countdown Timer
        6. Auto update of Date and Time
        
        select an option

        """;


//        PROFILE MENU
      String profileMenu = """
        1. Profile 
        
        select

        """;

//        SIM SERVICES MENU
      String simServicesMenu = """
        1. SIM Services 
        
        select

        """;

        System.out.println(mainMenu);
        int userValue = input.nextInt();       

        switch(userValue){
            //         Subphonebook
            case 1:{
                System.out.println(phonebookMenu);
                userValue = input.nextInt();  
                if (userValue == 8){
                System.out.println(phonebookOptions);
                    }
                if(userValue != 8){
                 break;
                }
            }
                   
            
            //   Sub PhoneMessagesMenu
            case 2:{
                System.out.println(phonemessageMenu);
                userValue = input.nextInt();  
                if (userValue == 7){
                System.out.println(MessageSettingsOptions);
                    }
                if(userValue != 7){
                 break;
                }
            }
            
            
            // Sub CallRegisterMenu
             case 4:{
                System.out.println(callRegisterMenu);
                userValue = input.nextInt();  
                if (userValue == 5){
                System.out.println(ShowCallDurationOptions);
                    }
                if(userValue != 5){
                 break;
                }
                
                if (userValue == 6){
                System.out.println(ShowCallCostsOptions);
                    }
                if(userValue != 6){
                 break;
                }
            }
                
                
               if (userValue == 7){
                System.out.println(CallCostSettingsOptions);
                    }
                if(userValue != 7){
                 break;
                }
            }  
                    
                
            }
            
              
            default:{
            System.out.println("Invalid entry");
            } 
            
//           end of switch cas curlybrace
        }
        

        
        
        
        
//        messages
//        if (userValue == 2){
//        System.out.println(phonemessageMenu);
//        }
//        
//       if (userValue == 3){
//        System.out.println(chatMenu);
//        } 
//        
//       if (userValue == 4){
//        System.out.println(callRegisterMenu);
//        }  
//        
//        if (userValue == 5){
//        System.out.println(tonesMenu);
//        }  
//        
//         if (userValue == 6){
//        System.out.println(settingsMenu);
//        }  
//        
//     if (userValue == 7){
//        System.out.println(callDivertMenu);
//        }  
//           
//      if (userValue == 8){
//        System.out.println(gamesMenu);
//        }   
//       
//       if (userValue == 9){
//        System.out.println(calculatorMenu);
//        }   
//        
//       if (userValue == 10){
//        System.out.println(reminderMenu);
//        }  
//       
//       if (userValue == 11){
//        System.out.println(clockMenu);
//        }  
//       
//        if (userValue == 12){
//        System.out.println(profileMenu);
//        }  
//        
//        if (userValue == 13){
//        System.out.println(simServicesMenu);
//        } 
        
        
    }
}
