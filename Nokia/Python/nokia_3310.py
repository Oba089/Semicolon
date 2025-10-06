def main():
    page = 0

    while True:
        if page == 0:
            print("""
Main Menu
1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Games
9. Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM services
-1. Exit
""")
            choice = int(input("Choose: "))

            if choice == 1:
                page = 1
            elif choice == 2:
                page = 2
            elif choice == 3:
                page = 3
            elif choice == 4:
                page = 4
            elif choice == 5:
                page = 5
            elif choice == 6:
                page = 6
            elif choice == 7:
                print("Opening Call divert...")
            elif choice == 8:
                print("Opening Games...")
            elif choice == 9:
                print("Opening Calculator...")
            elif choice == 10:
                print("Opening Reminders...")
            elif choice == 11:
                page = 11
            elif choice == 12:
                print("Opening Profiles...")
            elif choice == 13:
                print("Opening SIM services...")
            elif choice == -1:
                print("Exiting...")
                return
            else:
                print("Invalid choice!")

        elif page == 1:
            print("""
Phone book
1. Search
2. Add name
3. Erase
4. Edit
5. Assign tone
6. Send b’card
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Phone book option {choice} selected.")

        elif page == 2:
            print("""
Messages
1. Write message
2. Inbox
3. Outbox
4. Templates
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Messages option {choice} selected.")

        elif page == 3:
            print("""
Chat
Chat not implemented.
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0

        elif page == 4:
            print("""
Call register
1. Missed calls
2. Received calls
3. Dialled numbers
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Call register option {choice} selected.")

        elif page == 5:
            print("""
Tones
1. Ringing tone
2. Ringing volume
3. Message alert tone
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Tones option {choice} selected.")

        elif page == 6:
            print("""
Settings
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Settings option {choice} selected.")

        elif page == 11:
            print("""
Clock
1. Alarm clock
2. Date setting
3. Stopwatch
0. Back
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Clock option {choice} selected.")

        else:
            page = 0


if _name_ == "_main_":
    main()