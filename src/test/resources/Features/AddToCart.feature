Feature:  Add to cart  functionality check for Amazon E-commerce website 
Scenario: user add a product to the cart
Given I am in amazon home page
When I search for "Apple 14 yellow 128gb" 
And I open the first mobile
And I add the mobile to the cart
Then I should see the mobile added to my cart
