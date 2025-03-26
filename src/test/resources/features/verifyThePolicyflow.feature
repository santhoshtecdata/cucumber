
@full_flow 
Feature: policy flow
 

  @proposal_creating 
  Scenario: provide all credencials
    Given POS login in the vizza portal 
    When fill and get quote
    And select the care plan
    When verify the CKYC
    And fill the all mandatory field in proposer page
    And fill the insured page
    Then enter the nominee details
    And proposal created


