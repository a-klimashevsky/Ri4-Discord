
# GetCharactersCharacterIdContractsContractIdItems200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isIncluded** | **kotlin.Boolean** | true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract | 
**isSingleton** | **kotlin.Boolean** | is_singleton boolean | 
**quantity** | **kotlin.Int** | Number of items in the stack | 
**rawQuantity** | **kotlin.Int** | -1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy |  [optional]
**recordId** | **kotlin.Long** | Unique ID for the item | 
**typeId** | **kotlin.Int** | Type ID for item | 



