Feature: Login

Scenario: login
    Given User Launch chrome browser
    When User opens URL "https://10.32.100.92:8445/commonprov/Webconsole.action?isSessionExpired=1" 
    And register domain "brooklyn.com"
    And User enters Username as "mg"
    And User enters Password as "2222"
    And Click on button
    

    