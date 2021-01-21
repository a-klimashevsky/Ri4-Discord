
# GetContractsPublicItemsContractId200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isBlueprintCopy** | **kotlin.Boolean** | is_blueprint_copy boolean |  [optional]
**isIncluded** | **kotlin.Boolean** | true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract | 
**itemId** | **kotlin.Long** | Unique ID for the item being sold. Not present if item is being requested by contract rather than sold with contract |  [optional]
**materialEfficiency** | **kotlin.Int** | Material Efficiency Level of the blueprint |  [optional]
**quantity** | **kotlin.Int** | Number of items in the stack | 
**recordId** | **kotlin.Long** | Unique ID for the item, used by the contract system | 
**runs** | **kotlin.Int** | Number of runs remaining if the blueprint is a copy, -1 if it is an original |  [optional]
**timeEfficiency** | **kotlin.Int** | Time Efficiency Level of the blueprint |  [optional]
**typeId** | **kotlin.Int** | Type ID for item | 



