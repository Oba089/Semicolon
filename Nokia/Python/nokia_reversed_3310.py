def main():
    page = 0

    while True:
        if page == 0:
            print("""
Main Menu
-1. Exit
13. SIM services
12. Profiles
11. Clock
10. Reminders
9. Calculator
8. Games
7. Call divert
6. Settings
5. Tones
4. Call register
3. Chat
2. Messages
1. Phone book
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
0. Back
6. Send b’card
5. Assign tone
4. Edit
3. Erase
2. Add name
1. Search
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Phone book option {choice} selected.")

        elif page == 2:
            print("""
Messages
0. Back
4. Templates
3. Outbox
2. Inbox
1. Write message
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Messages option {choice} selected.")

        elif page == 3:
            print("""
Chat
0. Back
Chat not implemented.
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0

        elif page == 4:
            print("""
Call register
0. Back
3. Dialled numbers
2. Received calls
1. Missed calls
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Call register option {choice} selected.")

        elif page == 5:
            print("""
Tones
0. Back
3. Message alert tone
2. Ringing volume
1. Ringing tone
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Tones option {choice} selected.")

        elif page == 6:
            print("""
Settings
0. Back
4. Restore factory settings
3. Security settings
2. Phone settings
1. Call settings
""")
            choice = int(input("Choose: "))
            if choice == 0:
                page = 0
            else:
                print(f"Settings option {choice} selected.")

        elif page == 11:
            print("""
Clock
0. Back
3. Stopwatch
2. Date setting
1. Alarm clock
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