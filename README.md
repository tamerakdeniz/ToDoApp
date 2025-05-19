# 📝 ToDoApp

A simple, modern Android To-Do application built with Kotlin, Room, and Material Design.  
Project URL: [@https://github.com/tamerakdeniz/ToDoApp](https://github.com/tamerakdeniz/ToDoApp)

---

## 📁 Project Structure & Important Files

- **MainActivity:**  
  `app/src/main/java/com/example/todoapp/MainActivity.kt`

- **Fragments:**

  - Home: `app/src/main/java/com/example/todoapp/ui/fragment/HomeFragment.kt`
  - Add ToDo: `app/src/main/java/com/example/todoapp/ui/fragment/AddToDoFragment.kt`
  - Detail: `app/src/main/java/com/example/todoapp/ui/fragment/ToDoDetailFragment.kt`

- **ViewModels:**

  - Home: `app/src/main/java/com/example/todoapp/ui/viewmodel/HomeViewModel.kt`
  - Add: `app/src/main/java/com/example/todoapp/ui/viewmodel/AddToDoViewModel.kt`
  - Detail: `app/src/main/java/com/example/todoapp/ui/viewmodel/ToDoDetailViewModel.kt`

- **Room Database:**

  - Entity: `app/src/main/java/com/example/todoapp/data/entity/ToDos.kt`
  - DAO: `app/src/main/java/com/example/todoapp/room/ToDoDao.kt`
  - Database: `app/src/main/java/com/example/todoapp/room/Database.kt`

- **Navigation Graph:**  
  `app/src/main/res/navigation/nav_graph.xml`

- **UI Layouts:**
  - Home: `app/src/main/res/layout/fragment_home.xml`
  - Add: `app/src/main/res/layout/fragment_add_to_do.xml`
  - Detail: `app/src/main/res/layout/fragment_to_do_detail.xml`

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/tamerakdeniz/ToDoApp.git
```

### 2. Open in Android Studio

- File > Open > Select the `ToDoApp` folder.

### 3. Build & Run

- Connect your Android device or start an emulator.
- Click **Run** ▶️ in Android Studio.

---

## 📱 App Features

- **Add ToDo:**  
  Tap "ADD NEW" to create a new task.

- **Edit ToDo:**  
  Tap a task to view and update its details.

- **Delete ToDo:**  
  Tap the 🗑️ icon to remove a task.

- **Search:**  
  Use the search bar to filter your ToDos.

- **Full Screen:**  
  The app always runs in immersive full screen mode.

---

## 🛠️ Customization & Important Notes

- **Database:**  
  The app uses a pre-populated SQLite database (`app/src/main/assets/todo.sqlite`).

- **UI Colors:**  
  All text fields and the search bar use a consistent color scheme and rounded corners.

- **Navigation:**  
  Navigation is handled via the navigation graph for smooth transitions.

---

## 🙌 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open source. See the [LICENSE](LICENSE) file for details.

---

> Made with ❤️ by [tamerakdeniz](https://github.com/tamerakdeniz)
