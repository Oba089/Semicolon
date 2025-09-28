
def main_menu():
    """Displays the main menu and prompts for a choice."""
    print("\n--- Main Menu ---")
    print("1. Phone book")
    print("2. Messages")
    print("3. Chat")
    print("4. Call register")
    print("5. Tones")
    print("6. Settings")
    print("7. Call divert")
    print("8. Games")
    print("9. Calculator")
    print("10. Reminders")
    print("11. Clock")
    print("12. Profiles")
    print("13. SIM services")
    print("-1. Exit")
    return input("Choose: ")


def phone_book_menu():
    """Displays the Phone book submenu."""
    print("\n--- Phone book ---")
    print("1. Search")
    print("2. Add name")
    print("3. Erase")
    print("4. Edit")
    print("5. Assign tone")
    print("6. Send b’card")
    print("0. Back")
    return input("Choose: ")


def messages_menu():
    """Displays the Messages submenu."""
    print("\n--- Messages ---")
    print("1. Write message")
    print("2. Inbox")
    print("3. Outbox")
    print("4. Templates")
    print("0. Back")
    return input("Choose: ")


def chat_menu():
    """Displays the Chat submenu (simple placeholder)."""
    print("\n--- Chat ---")
    print("Chat not implemented.")
    print("0. Back")
    return input("Choose: ")


def call_register_menu():
    """Displays the Call register submenu."""
    print("\n--- Call register ---")
    print("1. Missed calls")
    print("2. Received calls")
    print("3. Dialled numbers")
    print("0. Back")
    return input("Choose: ")


def tones_menu():
    """Displays the Tones submenu."""
    print("\n--- Tones ---")
    print("1. Ringing tone")
    print("2. Ringing volume")
    print("3. Message alert tone")
    print("0. Back")
    return input("Choose: ")


def settings_menu():
    """Displays the Settings submenu."""
    print("\n--- Settings ---")
    print("1. Call settings")
    print("2. Phone settings")
    print("3. Security settings")
    print("4. Restore factory settings")
    print("0. Back")
    return input("Choose: ")


def clock_menu():
    """Displays the Clock submenu."""
    print("\n--- Clock ---")
    print("1. Alarm clock")
    print("2. Date setting")
    print("3. Stopwatch")
    print("0. Back")
    return input("Choose: ")


def nokia_menu():
    """
    Main loop for the Nokia 3310 menu simulation.
    Uses a 'page' variable to track the current menu level (0 is main menu).
    """
    print("Welcome to Nokia 3310 Menu")
    page = 0

    while True:
        if page == 0:
            choice = main_menu()
            if choice == "1":
                page = 1  # Phone book
            elif choice == "2":
                page = 2  # Messages
            elif choice == "3":
                page = 3  # Chat
            elif choice == "4":
                page = 4  # Call register
            elif choice == "5":
                page = 5  # Tones
            elif choice == "6":
                page = 6  # Settings
            elif choice == "7":
                print("Opening Call divert...")
            elif choice == "8":
                print("Opening Games...")
            elif choice == "9":
                print("Opening Calculator...")
            elif choice == "10":
                print("Opening Reminders...")
            elif choice == "11":
                page = 11  # Clock
            elif choice == "12":
                print("Opening Profiles...")
            elif choice == "13":
                print("Opening SIM services...")
            elif choice == "-1":
                print("Exiting...")
                break
            else:
                print("Invalid choice!")

        elif page == 1:
            choice = phone_book_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Phone book option {choice} selected.")

        elif page == 2:
            choice = messages_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Messages option {choice} selected.")

        elif page == 3:
            choice = chat_menu()
            if choice == "0":
                page = 0  # Back to Main Menu

        elif page == 4:
            choice = call_register_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Call register option {choice} selected.")

        elif page == 5:
            choice = tones_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Tones option {choice} selected.")

        elif page == 6:
            choice = settings_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Settings option {choice} selected.")

        elif page == 11:
            choice = clock_menu()
            if choice == "0":
                page = 0  # Back to Main Menu
            else:
                print(f"Clock option {choice} selected.")



if __name__ == "__main__":
    nokia_menu()
