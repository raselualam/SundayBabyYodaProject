@regression @apitesting
Feature: App user should able to create and get employee details

Scenario: Upskill multiple employee records

	Given Create new employee record
	When Get all employee data
	Then Get single employee data by id