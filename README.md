
###This is simple End to End test based on scenario:


    1. Goto http://google.com/ncr
    2. Search for “selenide”
    3. We expect to have a link to selenide.org as top-1 result.
    4. Switch to Images search
    5. We expect to have the first image to be somehow related to selenide.org site
    6. Switch back to “All” link
    7. We expect that we still have the same link to selenide.org as in step 3


###How to Start
    git clone https://github.com/romansyrotenko/searchGoogleSelenide.git
    cd searchGoogleSelenide
    mvn test
    

###Requarements
Firefox <= 47


    