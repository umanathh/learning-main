Feature: Tag concept explanation


@first
Scenario: login with username
Given search contacts
When contact search completed
Then click on save button


@second
Scenario: login with password
Given search password
When password search completed
Then click on remember button


@third
Scenario: login with email
Given search email
When email search completed
Then click on format button
