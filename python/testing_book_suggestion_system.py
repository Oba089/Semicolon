import random

class BookSuggestionSystem:

    def _init_(self, initial_books=None):
        self.book_list = initial_books or []

    def suggest_book(self):
        if not self.book_list:
            return None
        book = random.choice(self.book_list)
        page = random.randint(1, 100)
        return (book, page)

    def add_book(self, title):
        if title in self.book_list:
            return False
        self.book_list.append(title)
        return True

    def remove_book(self, title):
        if title in self.book_list:
            self.book_list.remove(title)
            return True
        return False

    def update_book(self, old_title, new_title):
        if old_title in self.book_list and new_title not in self.book_list:
            index = self.book_list.index(old_title)
            self.book_list[index] = new_title
            return True
        return False

    def get_books(self):
        return self.book_list.copy()