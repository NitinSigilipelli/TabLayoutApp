This Android application uses a tab layout to display images fetched from different API endpoints. Each tab corresponds to a different API endpoint.
## Sample Image
<img src="https://github.com/NitinSigilipelli/TabLayoutApp/assets/140246876/8dfb06be-b255-48b2-b80d-e528f7b3902f" alt="Sample Image" width="300"/>

## Features

- **Tab Layout**: Multiple tabs, each fetching and displaying images from different API endpoints.
- **Image Fetching**: Uses Retrofit to fetch images from APIs.
- **CardView**: Images are displayed within `CardView`s for a polished UI.
- **Refresh Button**: Allows users to refresh the images displayed in the current tab.

## Prerequisites

- Android Studio (latest version recommended)
- Android SDK
- A device or emulator running Android 5.0 (Lollipop) or higher

## Code Structure

### MainActivity.java
- Sets up the TabLayout and ViewPager.
- Uses MyPagerAdapter to manage the tabs.

### WaifuFragment.java, NekoFragment.java, ShinuboFragment.java
- Each fragment fetches images from a different API endpoint.
- Each fragment has its own layout and handles displaying images in a RecyclerView within a CardView.
- Each fragment includes a refresh button to reload images.

### MyPagerAdapter.java
- Extends FragmentPagerAdapter or FragmentStatePagerAdapter.
- Manages the three fragments (WaifuFragment, NekoFragment, ShinuboFragment).

### ImageResponse.java
- Acts as a model class.

### Service package
- Contains the `ApiService` interface and `ApiClient` for Retrofit instance.

## Brief Explanation of the Code

**MainActivity:**
- Initializes the TabLayout and ViewPager.
- Sets up MyPagerAdapter to provide the correct fragment for each tab.

**Fragments (WaifuFragment, NekoFragment, ShinuboFragment):**
- Each fragment is responsible for fetching and displaying images from a specific API endpoint.
- Retrofit is used to handle network requests.
- Images are displayed as each item wrapped in a CardView.
- Includes a refresh button to fetch new images from the API.

**MyPagerAdapter:**
- Manages the creation and lifecycle of the fragments associated with each tab.
- Provides the appropriate fragment when a tab is selected.

**XML Layouts:**
- `activity_main.xml`: Defines the layout for the main activity, including the TabLayout and ViewPager.
- `fragment_waifu.xml`, `fragment_neko.xml`, `fragment_shinubo.xml`: Layouts for the individual fragments.

## How It Works

1. MainActivity sets up the tab layout and view pager.
2. Each tab is associated with a specific fragment (WaifuFragment, NekoFragment, ShinuboFragment).
3. Each fragment fetches images from its respective API endpoint using Retrofit.
4. Images are displayed in a RecyclerView within a CardView.
5. The refresh button in each fragment allows users to refresh the images.

## Getting Started

### 1. Clone the Repository in Android Studio

1. Open Android Studio.
2. Click on `File > New > Project from Version Control`.
3. Select `Git` from the dropdown menu.
4. Enter the URL of the repository.
5. Click on clone.

### 2. Run the Application

1. Open the AVD Manager in Android Studio to select or create an emulator.
   - or
2. Connect your physical device via USB or ensure your emulator is running.

### Repository URL

```sh
https://github.com/NitinSigilipelli/TabLayoutApp.git
