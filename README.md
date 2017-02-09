
###This is a simple End to End test based on scenario:


    1. Goto http://google.com/ncr
    2. Search for “selenide”
    3. We expect to have a link to selenide.org as top-1 result.
    4. Switch to Images search
    5. We expect to have the first image to be somehow related to selenide.org site
    6. Switch back to “All” link
    7. We expect that we still have the same link to selenide.org as in step 3

###Before start
You should prepare your current environment for using different browsers

    1. Download current chromedriver from here https://sites.google.com/a/chromium.org/chromedriver/downloads
    2. Download and unzip current phantomjs driver from here http://phantomjs.org/download.html 
    3. Add info about current location where they are to your PATH variable 


###How to run test with default browser
    git clone https://github.com/romansyrotenko/searchGoogleSelenide.git
    cd searchGoogleSelenide
    mvn test
    
###How to run test with other browsers
    
    mvn test -P firefox     - run test in Firefox
    mvn test -P chrome      - run test in Chrome
    mvn test -P phantomjs   - run test in phantomjs browser 
    

###Requirements
Firefox <= 47


    