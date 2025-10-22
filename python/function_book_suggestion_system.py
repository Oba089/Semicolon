import random

book_list = ["Tom Ford", "Chronicles of Narnia", "The Last Dance", "Power Of A Dollar", "Blood And Cuts", "John Wick", "Minions", "Rugrats", "Little Mermaid"]


def suggest_books():
	book = random.choice(book_list)
	page = random.randint(1, 100)
	print(f"Suggested Book: '{book}' - Start from page {page}")
        

def add_book(new_book):
	for books in book_list:
		if books == new_book:
			return"This book already exists in the list."
	else:
	book_list.append(new_book)
	return f"{new_book} is added successfully."


def remove_book():

	if title in book_list:
	book_list.remove(title)
	print(f"Book '{title}' removed successfully.")
	else:
	print("Book not found in the list.")


def update_book():
	old_title = input("Enter the book title to update: ").strip()
		if old_title in book_list:
	new_title = input("Enter the new title: ").strip()
	if new_title in book_list:
	print("The new title already exists in the list.")
	else:
	index = book_list.index(old_title)
		book_list[index] = new_title
	print(f"Book '{old_title}' updated to '{new_title}'.")
	else:
	print("Book not found in the list.")


def show_books():
	if not book_list:
	print("No books available.")
	else:
	print("Books in the list:")
	for idx, book in enumerate(book_list, 1):
	print(f"{idx}. {book}")


