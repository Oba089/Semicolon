from function_book_suggestion_system import *
while True:
    print("\n--- Book Suggestion System ---")
    print("1. Suggest a book")
    print("2. Search for a book")
    print("3. Add a book")
    print("4. Delete a book")
    print("5. List all books")
    print("6. Exit")

    choice = input("Enter your choice (1-6): ")

    if choice == "1":
        suggest_books()
        
    elif choice == "2":
	add_book_input= input("enter a book to add")
        add_book(add_book_input)
       
    elif choice == "3":
        print("Adding a book...")
        
    elif choice == "4":
        print("Deleting a book...")
        
    elif choice == "5":
        print("Listing all books...")
       
    elif choice == "6":
        print("Exiting the Book Suggestion System. Goodbye!")
        break

    else:
        print("Invalid option. Please choose a valid number between 1 and 6.")
