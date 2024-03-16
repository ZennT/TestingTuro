Feature: Filtering cars

  Scenario: Filter car options
    Given User lands on filterUrl
    When User opens sortBy dropdown menu
    And User selects second option on the menu
    And User hits apply button

    And User opens pickup options dropdown
    And User selects pickup near location
    And User clicks on apply button

    And User opens book instantly dropdown
    And User clicks on view results button
    And User opens more filters dropdown
    And User clicks on vehicle type
    And User selects vehicle make and model
    And User selects number of seats
    And User selects transmission type
    And User selects electric vehicle option
    And User clicks on show more and selects toll pass
    And User clicks on allstar host
    And User clicks on view results




