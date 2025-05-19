# 📝 ToDoApp

A simple, modern Android To-Do application built with Kotlin, Room, and Material Design.  
Project URL: [@https://github.com/tamerakdeniz/ToDoApp](https://github.com/tamerakdeniz/ToDoApp)

<p align="center">
  <img src="https://github.com/user-attachments/assets/fdd6e214-62c8-430d-b3de-bb6846b0e3b7" alt="screenshot1" width="200"/>
  <img src="https://github.com/user-attachments/assets/661f304d-5aab-4535-bc99-843bab50d96b" alt="screenshot2" width="200"/>
  <img src="https://github.com/user-attachments/assets/9cf50612-1dcb-4c1d-aded-0bd979462f81" alt="screenshot3" width="200"/>
  <img src="https://github.com/user-attachments/assets/16bb219a-65b1-48c3-a0c2-d393d398558c" alt="screenshot4" width="200"/>
</p>


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
