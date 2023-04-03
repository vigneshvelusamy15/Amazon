Feature:  Product search functionality check for Amazon E-commerce Website
Background: 
Given user in amazon  home page
Scenario: user search a product by search box
When user enters  the product name in search box 
And clicks the search button
Then product details should be shown

Scenario: user search a product by categories
When user clicks the  all category button
And clicks the mobiles and computer section
And clicks the  all mobile phones section
Then product details is shown