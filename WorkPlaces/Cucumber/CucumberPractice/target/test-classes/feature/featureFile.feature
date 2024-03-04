Feature: Cucumber ractice 

Scenario Outline: Registeration on the page 
Given User is on the registeration page
Then User enters "first name" and "lastname"
Then User enters contact details "<Address>"
|Bhatgawan gauriganj Amethi | 

Then user mentioned "<emailid>"
Then User mentioned the "<phoneNumber>"
|phoneNumber |
|7081502850 |
Then user sets "<Password>" details

Examples:
|emailid       | Password |
|abc@gmail.com | abc@1212 |
|abc@der.cdf   | asd@342k |

