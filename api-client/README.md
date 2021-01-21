# tv.z85.esi - Kotlin client library for EVE Swagger Interface

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://esi.evetech.net/latest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllianceApi* | [**getAlliances**](docs/AllianceApi.md#getalliances) | **GET** /alliances/ | List all alliances
*AllianceApi* | [**getAlliancesAllianceId**](docs/AllianceApi.md#getalliancesallianceid) | **GET** /alliances/{alliance_id}/ | Get alliance information
*AllianceApi* | [**getAlliancesAllianceIdCorporations**](docs/AllianceApi.md#getalliancesallianceidcorporations) | **GET** /alliances/{alliance_id}/corporations/ | List alliance's corporations
*AllianceApi* | [**getAlliancesAllianceIdIcons**](docs/AllianceApi.md#getalliancesallianceidicons) | **GET** /alliances/{alliance_id}/icons/ | Get alliance icon
*AssetsApi* | [**getCharactersCharacterIdAssets**](docs/AssetsApi.md#getcharacterscharacteridassets) | **GET** /characters/{character_id}/assets/ | Get character assets
*AssetsApi* | [**getCorporationsCorporationIdAssets**](docs/AssetsApi.md#getcorporationscorporationidassets) | **GET** /corporations/{corporation_id}/assets/ | Get corporation assets
*AssetsApi* | [**postCharactersCharacterIdAssetsLocations**](docs/AssetsApi.md#postcharacterscharacteridassetslocations) | **POST** /characters/{character_id}/assets/locations/ | Get character asset locations
*AssetsApi* | [**postCharactersCharacterIdAssetsNames**](docs/AssetsApi.md#postcharacterscharacteridassetsnames) | **POST** /characters/{character_id}/assets/names/ | Get character asset names
*AssetsApi* | [**postCorporationsCorporationIdAssetsLocations**](docs/AssetsApi.md#postcorporationscorporationidassetslocations) | **POST** /corporations/{corporation_id}/assets/locations/ | Get corporation asset locations
*AssetsApi* | [**postCorporationsCorporationIdAssetsNames**](docs/AssetsApi.md#postcorporationscorporationidassetsnames) | **POST** /corporations/{corporation_id}/assets/names/ | Get corporation asset names
*BookmarksApi* | [**getCharactersCharacterIdBookmarks**](docs/BookmarksApi.md#getcharacterscharacteridbookmarks) | **GET** /characters/{character_id}/bookmarks/ | List bookmarks
*BookmarksApi* | [**getCharactersCharacterIdBookmarksFolders**](docs/BookmarksApi.md#getcharacterscharacteridbookmarksfolders) | **GET** /characters/{character_id}/bookmarks/folders/ | List bookmark folders
*BookmarksApi* | [**getCorporationsCorporationIdBookmarks**](docs/BookmarksApi.md#getcorporationscorporationidbookmarks) | **GET** /corporations/{corporation_id}/bookmarks/ | List corporation bookmarks
*BookmarksApi* | [**getCorporationsCorporationIdBookmarksFolders**](docs/BookmarksApi.md#getcorporationscorporationidbookmarksfolders) | **GET** /corporations/{corporation_id}/bookmarks/folders/ | List corporation bookmark folders
*CalendarApi* | [**getCharactersCharacterIdCalendar**](docs/CalendarApi.md#getcharacterscharacteridcalendar) | **GET** /characters/{character_id}/calendar/ | List calendar event summaries
*CalendarApi* | [**getCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#getcharacterscharacteridcalendareventid) | **GET** /characters/{character_id}/calendar/{event_id}/ | Get an event
*CalendarApi* | [**getCharactersCharacterIdCalendarEventIdAttendees**](docs/CalendarApi.md#getcharacterscharacteridcalendareventidattendees) | **GET** /characters/{character_id}/calendar/{event_id}/attendees/ | Get attendees
*CalendarApi* | [**putCharactersCharacterIdCalendarEventId**](docs/CalendarApi.md#putcharacterscharacteridcalendareventid) | **PUT** /characters/{character_id}/calendar/{event_id}/ | Respond to an event
*CharacterApi* | [**getCharactersCharacterId**](docs/CharacterApi.md#getcharacterscharacterid) | **GET** /characters/{character_id}/ | Get character's public information
*CharacterApi* | [**getCharactersCharacterIdAgentsResearch**](docs/CharacterApi.md#getcharacterscharacteridagentsresearch) | **GET** /characters/{character_id}/agents_research/ | Get agents research
*CharacterApi* | [**getCharactersCharacterIdBlueprints**](docs/CharacterApi.md#getcharacterscharacteridblueprints) | **GET** /characters/{character_id}/blueprints/ | Get blueprints
*CharacterApi* | [**getCharactersCharacterIdCorporationhistory**](docs/CharacterApi.md#getcharacterscharacteridcorporationhistory) | **GET** /characters/{character_id}/corporationhistory/ | Get corporation history
*CharacterApi* | [**getCharactersCharacterIdFatigue**](docs/CharacterApi.md#getcharacterscharacteridfatigue) | **GET** /characters/{character_id}/fatigue/ | Get jump fatigue
*CharacterApi* | [**getCharactersCharacterIdMedals**](docs/CharacterApi.md#getcharacterscharacteridmedals) | **GET** /characters/{character_id}/medals/ | Get medals
*CharacterApi* | [**getCharactersCharacterIdNotifications**](docs/CharacterApi.md#getcharacterscharacteridnotifications) | **GET** /characters/{character_id}/notifications/ | Get character notifications
*CharacterApi* | [**getCharactersCharacterIdNotificationsContacts**](docs/CharacterApi.md#getcharacterscharacteridnotificationscontacts) | **GET** /characters/{character_id}/notifications/contacts/ | Get new contact notifications
*CharacterApi* | [**getCharactersCharacterIdPortrait**](docs/CharacterApi.md#getcharacterscharacteridportrait) | **GET** /characters/{character_id}/portrait/ | Get character portraits
*CharacterApi* | [**getCharactersCharacterIdRoles**](docs/CharacterApi.md#getcharacterscharacteridroles) | **GET** /characters/{character_id}/roles/ | Get character corporation roles
*CharacterApi* | [**getCharactersCharacterIdStandings**](docs/CharacterApi.md#getcharacterscharacteridstandings) | **GET** /characters/{character_id}/standings/ | Get standings
*CharacterApi* | [**getCharactersCharacterIdTitles**](docs/CharacterApi.md#getcharacterscharacteridtitles) | **GET** /characters/{character_id}/titles/ | Get character corporation titles
*CharacterApi* | [**postCharactersAffiliation**](docs/CharacterApi.md#postcharactersaffiliation) | **POST** /characters/affiliation/ | Character affiliation
*CharacterApi* | [**postCharactersCharacterIdCspa**](docs/CharacterApi.md#postcharacterscharacteridcspa) | **POST** /characters/{character_id}/cspa/ | Calculate a CSPA charge cost
*ClonesApi* | [**getCharactersCharacterIdClones**](docs/ClonesApi.md#getcharacterscharacteridclones) | **GET** /characters/{character_id}/clones/ | Get clones
*ClonesApi* | [**getCharactersCharacterIdImplants**](docs/ClonesApi.md#getcharacterscharacteridimplants) | **GET** /characters/{character_id}/implants/ | Get active implants
*ContactsApi* | [**deleteCharactersCharacterIdContacts**](docs/ContactsApi.md#deletecharacterscharacteridcontacts) | **DELETE** /characters/{character_id}/contacts/ | Delete contacts
*ContactsApi* | [**getAlliancesAllianceIdContacts**](docs/ContactsApi.md#getalliancesallianceidcontacts) | **GET** /alliances/{alliance_id}/contacts/ | Get alliance contacts
*ContactsApi* | [**getAlliancesAllianceIdContactsLabels**](docs/ContactsApi.md#getalliancesallianceidcontactslabels) | **GET** /alliances/{alliance_id}/contacts/labels/ | Get alliance contact labels
*ContactsApi* | [**getCharactersCharacterIdContacts**](docs/ContactsApi.md#getcharacterscharacteridcontacts) | **GET** /characters/{character_id}/contacts/ | Get contacts
*ContactsApi* | [**getCharactersCharacterIdContactsLabels**](docs/ContactsApi.md#getcharacterscharacteridcontactslabels) | **GET** /characters/{character_id}/contacts/labels/ | Get contact labels
*ContactsApi* | [**getCorporationsCorporationIdContacts**](docs/ContactsApi.md#getcorporationscorporationidcontacts) | **GET** /corporations/{corporation_id}/contacts/ | Get corporation contacts
*ContactsApi* | [**getCorporationsCorporationIdContactsLabels**](docs/ContactsApi.md#getcorporationscorporationidcontactslabels) | **GET** /corporations/{corporation_id}/contacts/labels/ | Get corporation contact labels
*ContactsApi* | [**postCharactersCharacterIdContacts**](docs/ContactsApi.md#postcharacterscharacteridcontacts) | **POST** /characters/{character_id}/contacts/ | Add contacts
*ContactsApi* | [**putCharactersCharacterIdContacts**](docs/ContactsApi.md#putcharacterscharacteridcontacts) | **PUT** /characters/{character_id}/contacts/ | Edit contacts
*ContractsApi* | [**getCharactersCharacterIdContracts**](docs/ContractsApi.md#getcharacterscharacteridcontracts) | **GET** /characters/{character_id}/contracts/ | Get contracts
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdBids**](docs/ContractsApi.md#getcharacterscharacteridcontractscontractidbids) | **GET** /characters/{character_id}/contracts/{contract_id}/bids/ | Get contract bids
*ContractsApi* | [**getCharactersCharacterIdContractsContractIdItems**](docs/ContractsApi.md#getcharacterscharacteridcontractscontractiditems) | **GET** /characters/{character_id}/contracts/{contract_id}/items/ | Get contract items
*ContractsApi* | [**getContractsPublicBidsContractId**](docs/ContractsApi.md#getcontractspublicbidscontractid) | **GET** /contracts/public/bids/{contract_id}/ | Get public contract bids
*ContractsApi* | [**getContractsPublicItemsContractId**](docs/ContractsApi.md#getcontractspublicitemscontractid) | **GET** /contracts/public/items/{contract_id}/ | Get public contract items
*ContractsApi* | [**getContractsPublicRegionId**](docs/ContractsApi.md#getcontractspublicregionid) | **GET** /contracts/public/{region_id}/ | Get public contracts
*ContractsApi* | [**getCorporationsCorporationIdContracts**](docs/ContractsApi.md#getcorporationscorporationidcontracts) | **GET** /corporations/{corporation_id}/contracts/ | Get corporation contracts
*ContractsApi* | [**getCorporationsCorporationIdContractsContractIdBids**](docs/ContractsApi.md#getcorporationscorporationidcontractscontractidbids) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/bids/ | Get corporation contract bids
*ContractsApi* | [**getCorporationsCorporationIdContractsContractIdItems**](docs/ContractsApi.md#getcorporationscorporationidcontractscontractiditems) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/items/ | Get corporation contract items
*CorporationApi* | [**getCorporationsCorporationId**](docs/CorporationApi.md#getcorporationscorporationid) | **GET** /corporations/{corporation_id}/ | Get corporation information
*CorporationApi* | [**getCorporationsCorporationIdAlliancehistory**](docs/CorporationApi.md#getcorporationscorporationidalliancehistory) | **GET** /corporations/{corporation_id}/alliancehistory/ | Get alliance history
*CorporationApi* | [**getCorporationsCorporationIdBlueprints**](docs/CorporationApi.md#getcorporationscorporationidblueprints) | **GET** /corporations/{corporation_id}/blueprints/ | Get corporation blueprints
*CorporationApi* | [**getCorporationsCorporationIdContainersLogs**](docs/CorporationApi.md#getcorporationscorporationidcontainerslogs) | **GET** /corporations/{corporation_id}/containers/logs/ | Get all corporation ALSC logs
*CorporationApi* | [**getCorporationsCorporationIdDivisions**](docs/CorporationApi.md#getcorporationscorporationiddivisions) | **GET** /corporations/{corporation_id}/divisions/ | Get corporation divisions
*CorporationApi* | [**getCorporationsCorporationIdFacilities**](docs/CorporationApi.md#getcorporationscorporationidfacilities) | **GET** /corporations/{corporation_id}/facilities/ | Get corporation facilities
*CorporationApi* | [**getCorporationsCorporationIdIcons**](docs/CorporationApi.md#getcorporationscorporationidicons) | **GET** /corporations/{corporation_id}/icons/ | Get corporation icon
*CorporationApi* | [**getCorporationsCorporationIdMedals**](docs/CorporationApi.md#getcorporationscorporationidmedals) | **GET** /corporations/{corporation_id}/medals/ | Get corporation medals
*CorporationApi* | [**getCorporationsCorporationIdMedalsIssued**](docs/CorporationApi.md#getcorporationscorporationidmedalsissued) | **GET** /corporations/{corporation_id}/medals/issued/ | Get corporation issued medals
*CorporationApi* | [**getCorporationsCorporationIdMembers**](docs/CorporationApi.md#getcorporationscorporationidmembers) | **GET** /corporations/{corporation_id}/members/ | Get corporation members
*CorporationApi* | [**getCorporationsCorporationIdMembersLimit**](docs/CorporationApi.md#getcorporationscorporationidmemberslimit) | **GET** /corporations/{corporation_id}/members/limit/ | Get corporation member limit
*CorporationApi* | [**getCorporationsCorporationIdMembersTitles**](docs/CorporationApi.md#getcorporationscorporationidmemberstitles) | **GET** /corporations/{corporation_id}/members/titles/ | Get corporation's members' titles
*CorporationApi* | [**getCorporationsCorporationIdMembertracking**](docs/CorporationApi.md#getcorporationscorporationidmembertracking) | **GET** /corporations/{corporation_id}/membertracking/ | Track corporation members
*CorporationApi* | [**getCorporationsCorporationIdRoles**](docs/CorporationApi.md#getcorporationscorporationidroles) | **GET** /corporations/{corporation_id}/roles/ | Get corporation member roles
*CorporationApi* | [**getCorporationsCorporationIdRolesHistory**](docs/CorporationApi.md#getcorporationscorporationidroleshistory) | **GET** /corporations/{corporation_id}/roles/history/ | Get corporation member roles history
*CorporationApi* | [**getCorporationsCorporationIdShareholders**](docs/CorporationApi.md#getcorporationscorporationidshareholders) | **GET** /corporations/{corporation_id}/shareholders/ | Get corporation shareholders
*CorporationApi* | [**getCorporationsCorporationIdStandings**](docs/CorporationApi.md#getcorporationscorporationidstandings) | **GET** /corporations/{corporation_id}/standings/ | Get corporation standings
*CorporationApi* | [**getCorporationsCorporationIdStarbases**](docs/CorporationApi.md#getcorporationscorporationidstarbases) | **GET** /corporations/{corporation_id}/starbases/ | Get corporation starbases (POSes)
*CorporationApi* | [**getCorporationsCorporationIdStarbasesStarbaseId**](docs/CorporationApi.md#getcorporationscorporationidstarbasesstarbaseid) | **GET** /corporations/{corporation_id}/starbases/{starbase_id}/ | Get starbase (POS) detail
*CorporationApi* | [**getCorporationsCorporationIdStructures**](docs/CorporationApi.md#getcorporationscorporationidstructures) | **GET** /corporations/{corporation_id}/structures/ | Get corporation structures
*CorporationApi* | [**getCorporationsCorporationIdTitles**](docs/CorporationApi.md#getcorporationscorporationidtitles) | **GET** /corporations/{corporation_id}/titles/ | Get corporation titles
*CorporationApi* | [**getCorporationsNpccorps**](docs/CorporationApi.md#getcorporationsnpccorps) | **GET** /corporations/npccorps/ | Get npc corporations
*DogmaApi* | [**getDogmaAttributes**](docs/DogmaApi.md#getdogmaattributes) | **GET** /dogma/attributes/ | Get attributes
*DogmaApi* | [**getDogmaAttributesAttributeId**](docs/DogmaApi.md#getdogmaattributesattributeid) | **GET** /dogma/attributes/{attribute_id}/ | Get attribute information
*DogmaApi* | [**getDogmaDynamicItemsTypeIdItemId**](docs/DogmaApi.md#getdogmadynamicitemstypeiditemid) | **GET** /dogma/dynamic/items/{type_id}/{item_id}/ | Get dynamic item information
*DogmaApi* | [**getDogmaEffects**](docs/DogmaApi.md#getdogmaeffects) | **GET** /dogma/effects/ | Get effects
*DogmaApi* | [**getDogmaEffectsEffectId**](docs/DogmaApi.md#getdogmaeffectseffectid) | **GET** /dogma/effects/{effect_id}/ | Get effect information
*FactionWarfareApi* | [**getCharactersCharacterIdFwStats**](docs/FactionWarfareApi.md#getcharacterscharacteridfwstats) | **GET** /characters/{character_id}/fw/stats/ | Overview of a character involved in faction warfare
*FactionWarfareApi* | [**getCorporationsCorporationIdFwStats**](docs/FactionWarfareApi.md#getcorporationscorporationidfwstats) | **GET** /corporations/{corporation_id}/fw/stats/ | Overview of a corporation involved in faction warfare
*FactionWarfareApi* | [**getFwLeaderboards**](docs/FactionWarfareApi.md#getfwleaderboards) | **GET** /fw/leaderboards/ | List of the top factions in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCharacters**](docs/FactionWarfareApi.md#getfwleaderboardscharacters) | **GET** /fw/leaderboards/characters/ | List of the top pilots in faction warfare
*FactionWarfareApi* | [**getFwLeaderboardsCorporations**](docs/FactionWarfareApi.md#getfwleaderboardscorporations) | **GET** /fw/leaderboards/corporations/ | List of the top corporations in faction warfare
*FactionWarfareApi* | [**getFwStats**](docs/FactionWarfareApi.md#getfwstats) | **GET** /fw/stats/ | An overview of statistics about factions involved in faction warfare
*FactionWarfareApi* | [**getFwSystems**](docs/FactionWarfareApi.md#getfwsystems) | **GET** /fw/systems/ | Ownership of faction warfare systems
*FactionWarfareApi* | [**getFwWars**](docs/FactionWarfareApi.md#getfwwars) | **GET** /fw/wars/ | Data about which NPC factions are at war
*FittingsApi* | [**deleteCharactersCharacterIdFittingsFittingId**](docs/FittingsApi.md#deletecharacterscharacteridfittingsfittingid) | **DELETE** /characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
*FittingsApi* | [**getCharactersCharacterIdFittings**](docs/FittingsApi.md#getcharacterscharacteridfittings) | **GET** /characters/{character_id}/fittings/ | Get fittings
*FittingsApi* | [**postCharactersCharacterIdFittings**](docs/FittingsApi.md#postcharacterscharacteridfittings) | **POST** /characters/{character_id}/fittings/ | Create fitting
*FleetsApi* | [**deleteFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#deletefleetsfleetidmembersmemberid) | **DELETE** /fleets/{fleet_id}/members/{member_id}/ | Kick fleet member
*FleetsApi* | [**deleteFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#deletefleetsfleetidsquadssquadid) | **DELETE** /fleets/{fleet_id}/squads/{squad_id}/ | Delete fleet squad
*FleetsApi* | [**deleteFleetsFleetIdWingsWingId**](docs/FleetsApi.md#deletefleetsfleetidwingswingid) | **DELETE** /fleets/{fleet_id}/wings/{wing_id}/ | Delete fleet wing
*FleetsApi* | [**getCharactersCharacterIdFleet**](docs/FleetsApi.md#getcharacterscharacteridfleet) | **GET** /characters/{character_id}/fleet/ | Get character fleet info
*FleetsApi* | [**getFleetsFleetId**](docs/FleetsApi.md#getfleetsfleetid) | **GET** /fleets/{fleet_id}/ | Get fleet information
*FleetsApi* | [**getFleetsFleetIdMembers**](docs/FleetsApi.md#getfleetsfleetidmembers) | **GET** /fleets/{fleet_id}/members/ | Get fleet members
*FleetsApi* | [**getFleetsFleetIdWings**](docs/FleetsApi.md#getfleetsfleetidwings) | **GET** /fleets/{fleet_id}/wings/ | Get fleet wings
*FleetsApi* | [**postFleetsFleetIdMembers**](docs/FleetsApi.md#postfleetsfleetidmembers) | **POST** /fleets/{fleet_id}/members/ | Create fleet invitation
*FleetsApi* | [**postFleetsFleetIdWings**](docs/FleetsApi.md#postfleetsfleetidwings) | **POST** /fleets/{fleet_id}/wings/ | Create fleet wing
*FleetsApi* | [**postFleetsFleetIdWingsWingIdSquads**](docs/FleetsApi.md#postfleetsfleetidwingswingidsquads) | **POST** /fleets/{fleet_id}/wings/{wing_id}/squads/ | Create fleet squad
*FleetsApi* | [**putFleetsFleetId**](docs/FleetsApi.md#putfleetsfleetid) | **PUT** /fleets/{fleet_id}/ | Update fleet
*FleetsApi* | [**putFleetsFleetIdMembersMemberId**](docs/FleetsApi.md#putfleetsfleetidmembersmemberid) | **PUT** /fleets/{fleet_id}/members/{member_id}/ | Move fleet member
*FleetsApi* | [**putFleetsFleetIdSquadsSquadId**](docs/FleetsApi.md#putfleetsfleetidsquadssquadid) | **PUT** /fleets/{fleet_id}/squads/{squad_id}/ | Rename fleet squad
*FleetsApi* | [**putFleetsFleetIdWingsWingId**](docs/FleetsApi.md#putfleetsfleetidwingswingid) | **PUT** /fleets/{fleet_id}/wings/{wing_id}/ | Rename fleet wing
*IncursionsApi* | [**getIncursions**](docs/IncursionsApi.md#getincursions) | **GET** /incursions/ | List incursions
*IndustryApi* | [**getCharactersCharacterIdIndustryJobs**](docs/IndustryApi.md#getcharacterscharacteridindustryjobs) | **GET** /characters/{character_id}/industry/jobs/ | List character industry jobs
*IndustryApi* | [**getCharactersCharacterIdMining**](docs/IndustryApi.md#getcharacterscharacteridmining) | **GET** /characters/{character_id}/mining/ | Character mining ledger
*IndustryApi* | [**getCorporationCorporationIdMiningExtractions**](docs/IndustryApi.md#getcorporationcorporationidminingextractions) | **GET** /corporation/{corporation_id}/mining/extractions/ | Moon extraction timers
*IndustryApi* | [**getCorporationCorporationIdMiningObservers**](docs/IndustryApi.md#getcorporationcorporationidminingobservers) | **GET** /corporation/{corporation_id}/mining/observers/ | Corporation mining observers
*IndustryApi* | [**getCorporationCorporationIdMiningObserversObserverId**](docs/IndustryApi.md#getcorporationcorporationidminingobserversobserverid) | **GET** /corporation/{corporation_id}/mining/observers/{observer_id}/ | Observed corporation mining
*IndustryApi* | [**getCorporationsCorporationIdIndustryJobs**](docs/IndustryApi.md#getcorporationscorporationidindustryjobs) | **GET** /corporations/{corporation_id}/industry/jobs/ | List corporation industry jobs
*IndustryApi* | [**getIndustryFacilities**](docs/IndustryApi.md#getindustryfacilities) | **GET** /industry/facilities/ | List industry facilities
*IndustryApi* | [**getIndustrySystems**](docs/IndustryApi.md#getindustrysystems) | **GET** /industry/systems/ | List solar system cost indices
*InsuranceApi* | [**getInsurancePrices**](docs/InsuranceApi.md#getinsuranceprices) | **GET** /insurance/prices/ | List insurance levels
*KillmailsApi* | [**getCharactersCharacterIdKillmailsRecent**](docs/KillmailsApi.md#getcharacterscharacteridkillmailsrecent) | **GET** /characters/{character_id}/killmails/recent/ | Get a character's recent kills and losses
*KillmailsApi* | [**getCorporationsCorporationIdKillmailsRecent**](docs/KillmailsApi.md#getcorporationscorporationidkillmailsrecent) | **GET** /corporations/{corporation_id}/killmails/recent/ | Get a corporation's recent kills and losses
*KillmailsApi* | [**getKillmailsKillmailIdKillmailHash**](docs/KillmailsApi.md#getkillmailskillmailidkillmailhash) | **GET** /killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail
*LocationApi* | [**getCharactersCharacterIdLocation**](docs/LocationApi.md#getcharacterscharacteridlocation) | **GET** /characters/{character_id}/location/ | Get character location
*LocationApi* | [**getCharactersCharacterIdOnline**](docs/LocationApi.md#getcharacterscharacteridonline) | **GET** /characters/{character_id}/online/ | Get character online
*LocationApi* | [**getCharactersCharacterIdShip**](docs/LocationApi.md#getcharacterscharacteridship) | **GET** /characters/{character_id}/ship/ | Get current ship
*LoyaltyApi* | [**getCharactersCharacterIdLoyaltyPoints**](docs/LoyaltyApi.md#getcharacterscharacteridloyaltypoints) | **GET** /characters/{character_id}/loyalty/points/ | Get loyalty points
*LoyaltyApi* | [**getLoyaltyStoresCorporationIdOffers**](docs/LoyaltyApi.md#getloyaltystorescorporationidoffers) | **GET** /loyalty/stores/{corporation_id}/offers/ | List loyalty store offers
*MailApi* | [**deleteCharactersCharacterIdMailLabelsLabelId**](docs/MailApi.md#deletecharacterscharacteridmaillabelslabelid) | **DELETE** /characters/{character_id}/mail/labels/{label_id}/ | Delete a mail label
*MailApi* | [**deleteCharactersCharacterIdMailMailId**](docs/MailApi.md#deletecharacterscharacteridmailmailid) | **DELETE** /characters/{character_id}/mail/{mail_id}/ | Delete a mail
*MailApi* | [**getCharactersCharacterIdMail**](docs/MailApi.md#getcharacterscharacteridmail) | **GET** /characters/{character_id}/mail/ | Return mail headers
*MailApi* | [**getCharactersCharacterIdMailLabels**](docs/MailApi.md#getcharacterscharacteridmaillabels) | **GET** /characters/{character_id}/mail/labels/ | Get mail labels and unread counts
*MailApi* | [**getCharactersCharacterIdMailLists**](docs/MailApi.md#getcharacterscharacteridmaillists) | **GET** /characters/{character_id}/mail/lists/ | Return mailing list subscriptions
*MailApi* | [**getCharactersCharacterIdMailMailId**](docs/MailApi.md#getcharacterscharacteridmailmailid) | **GET** /characters/{character_id}/mail/{mail_id}/ | Return a mail
*MailApi* | [**postCharactersCharacterIdMail**](docs/MailApi.md#postcharacterscharacteridmail) | **POST** /characters/{character_id}/mail/ | Send a new mail
*MailApi* | [**postCharactersCharacterIdMailLabels**](docs/MailApi.md#postcharacterscharacteridmaillabels) | **POST** /characters/{character_id}/mail/labels/ | Create a mail label
*MailApi* | [**putCharactersCharacterIdMailMailId**](docs/MailApi.md#putcharacterscharacteridmailmailid) | **PUT** /characters/{character_id}/mail/{mail_id}/ | Update metadata about a mail
*MarketApi* | [**getCharactersCharacterIdOrders**](docs/MarketApi.md#getcharacterscharacteridorders) | **GET** /characters/{character_id}/orders/ | List open orders from a character
*MarketApi* | [**getCharactersCharacterIdOrdersHistory**](docs/MarketApi.md#getcharacterscharacteridordershistory) | **GET** /characters/{character_id}/orders/history/ | List historical orders by a character
*MarketApi* | [**getCorporationsCorporationIdOrders**](docs/MarketApi.md#getcorporationscorporationidorders) | **GET** /corporations/{corporation_id}/orders/ | List open orders from a corporation
*MarketApi* | [**getCorporationsCorporationIdOrdersHistory**](docs/MarketApi.md#getcorporationscorporationidordershistory) | **GET** /corporations/{corporation_id}/orders/history/ | List historical orders from a corporation
*MarketApi* | [**getMarketsGroups**](docs/MarketApi.md#getmarketsgroups) | **GET** /markets/groups/ | Get item groups
*MarketApi* | [**getMarketsGroupsMarketGroupId**](docs/MarketApi.md#getmarketsgroupsmarketgroupid) | **GET** /markets/groups/{market_group_id}/ | Get item group information
*MarketApi* | [**getMarketsPrices**](docs/MarketApi.md#getmarketsprices) | **GET** /markets/prices/ | List market prices
*MarketApi* | [**getMarketsRegionIdHistory**](docs/MarketApi.md#getmarketsregionidhistory) | **GET** /markets/{region_id}/history/ | List historical market statistics in a region
*MarketApi* | [**getMarketsRegionIdOrders**](docs/MarketApi.md#getmarketsregionidorders) | **GET** /markets/{region_id}/orders/ | List orders in a region
*MarketApi* | [**getMarketsRegionIdTypes**](docs/MarketApi.md#getmarketsregionidtypes) | **GET** /markets/{region_id}/types/ | List type IDs relevant to a market
*MarketApi* | [**getMarketsStructuresStructureId**](docs/MarketApi.md#getmarketsstructuresstructureid) | **GET** /markets/structures/{structure_id}/ | List orders in a structure
*OpportunitiesApi* | [**getCharactersCharacterIdOpportunities**](docs/OpportunitiesApi.md#getcharacterscharacteridopportunities) | **GET** /characters/{character_id}/opportunities/ | Get a character's completed tasks
*OpportunitiesApi* | [**getOpportunitiesGroups**](docs/OpportunitiesApi.md#getopportunitiesgroups) | **GET** /opportunities/groups/ | Get opportunities groups
*OpportunitiesApi* | [**getOpportunitiesGroupsGroupId**](docs/OpportunitiesApi.md#getopportunitiesgroupsgroupid) | **GET** /opportunities/groups/{group_id}/ | Get opportunities group
*OpportunitiesApi* | [**getOpportunitiesTasks**](docs/OpportunitiesApi.md#getopportunitiestasks) | **GET** /opportunities/tasks/ | Get opportunities tasks
*OpportunitiesApi* | [**getOpportunitiesTasksTaskId**](docs/OpportunitiesApi.md#getopportunitiestaskstaskid) | **GET** /opportunities/tasks/{task_id}/ | Get opportunities task
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanets**](docs/PlanetaryInteractionApi.md#getcharacterscharacteridplanets) | **GET** /characters/{character_id}/planets/ | Get colonies
*PlanetaryInteractionApi* | [**getCharactersCharacterIdPlanetsPlanetId**](docs/PlanetaryInteractionApi.md#getcharacterscharacteridplanetsplanetid) | **GET** /characters/{character_id}/planets/{planet_id}/ | Get colony layout
*PlanetaryInteractionApi* | [**getCorporationsCorporationIdCustomsOffices**](docs/PlanetaryInteractionApi.md#getcorporationscorporationidcustomsoffices) | **GET** /corporations/{corporation_id}/customs_offices/ | List corporation customs offices
*PlanetaryInteractionApi* | [**getUniverseSchematicsSchematicId**](docs/PlanetaryInteractionApi.md#getuniverseschematicsschematicid) | **GET** /universe/schematics/{schematic_id}/ | Get schematic information
*RoutesApi* | [**getRouteOriginDestination**](docs/RoutesApi.md#getrouteorigindestination) | **GET** /route/{origin}/{destination}/ | Get route
*SearchApi* | [**getCharactersCharacterIdSearch**](docs/SearchApi.md#getcharacterscharacteridsearch) | **GET** /characters/{character_id}/search/ | Search on a string
*SearchApi* | [**getSearch**](docs/SearchApi.md#getsearch) | **GET** /search/ | Search on a string
*SkillsApi* | [**getCharactersCharacterIdAttributes**](docs/SkillsApi.md#getcharacterscharacteridattributes) | **GET** /characters/{character_id}/attributes/ | Get character attributes
*SkillsApi* | [**getCharactersCharacterIdSkillqueue**](docs/SkillsApi.md#getcharacterscharacteridskillqueue) | **GET** /characters/{character_id}/skillqueue/ | Get character's skill queue
*SkillsApi* | [**getCharactersCharacterIdSkills**](docs/SkillsApi.md#getcharacterscharacteridskills) | **GET** /characters/{character_id}/skills/ | Get character skills
*SovereigntyApi* | [**getSovereigntyCampaigns**](docs/SovereigntyApi.md#getsovereigntycampaigns) | **GET** /sovereignty/campaigns/ | List sovereignty campaigns
*SovereigntyApi* | [**getSovereigntyMap**](docs/SovereigntyApi.md#getsovereigntymap) | **GET** /sovereignty/map/ | List sovereignty of systems
*SovereigntyApi* | [**getSovereigntyStructures**](docs/SovereigntyApi.md#getsovereigntystructures) | **GET** /sovereignty/structures/ | List sovereignty structures
*StatusApi* | [**getStatus**](docs/StatusApi.md#getstatus) | **GET** /status/ | Retrieve the uptime and player counts
*UniverseApi* | [**getUniverseAncestries**](docs/UniverseApi.md#getuniverseancestries) | **GET** /universe/ancestries/ | Get ancestries
*UniverseApi* | [**getUniverseAsteroidBeltsAsteroidBeltId**](docs/UniverseApi.md#getuniverseasteroidbeltsasteroidbeltid) | **GET** /universe/asteroid_belts/{asteroid_belt_id}/ | Get asteroid belt information
*UniverseApi* | [**getUniverseBloodlines**](docs/UniverseApi.md#getuniversebloodlines) | **GET** /universe/bloodlines/ | Get bloodlines
*UniverseApi* | [**getUniverseCategories**](docs/UniverseApi.md#getuniversecategories) | **GET** /universe/categories/ | Get item categories
*UniverseApi* | [**getUniverseCategoriesCategoryId**](docs/UniverseApi.md#getuniversecategoriescategoryid) | **GET** /universe/categories/{category_id}/ | Get item category information
*UniverseApi* | [**getUniverseConstellations**](docs/UniverseApi.md#getuniverseconstellations) | **GET** /universe/constellations/ | Get constellations
*UniverseApi* | [**getUniverseConstellationsConstellationId**](docs/UniverseApi.md#getuniverseconstellationsconstellationid) | **GET** /universe/constellations/{constellation_id}/ | Get constellation information
*UniverseApi* | [**getUniverseFactions**](docs/UniverseApi.md#getuniversefactions) | **GET** /universe/factions/ | Get factions
*UniverseApi* | [**getUniverseGraphics**](docs/UniverseApi.md#getuniversegraphics) | **GET** /universe/graphics/ | Get graphics
*UniverseApi* | [**getUniverseGraphicsGraphicId**](docs/UniverseApi.md#getuniversegraphicsgraphicid) | **GET** /universe/graphics/{graphic_id}/ | Get graphic information
*UniverseApi* | [**getUniverseGroups**](docs/UniverseApi.md#getuniversegroups) | **GET** /universe/groups/ | Get item groups
*UniverseApi* | [**getUniverseGroupsGroupId**](docs/UniverseApi.md#getuniversegroupsgroupid) | **GET** /universe/groups/{group_id}/ | Get item group information
*UniverseApi* | [**getUniverseMoonsMoonId**](docs/UniverseApi.md#getuniversemoonsmoonid) | **GET** /universe/moons/{moon_id}/ | Get moon information
*UniverseApi* | [**getUniversePlanetsPlanetId**](docs/UniverseApi.md#getuniverseplanetsplanetid) | **GET** /universe/planets/{planet_id}/ | Get planet information
*UniverseApi* | [**getUniverseRaces**](docs/UniverseApi.md#getuniverseraces) | **GET** /universe/races/ | Get character races
*UniverseApi* | [**getUniverseRegions**](docs/UniverseApi.md#getuniverseregions) | **GET** /universe/regions/ | Get regions
*UniverseApi* | [**getUniverseRegionsRegionId**](docs/UniverseApi.md#getuniverseregionsregionid) | **GET** /universe/regions/{region_id}/ | Get region information
*UniverseApi* | [**getUniverseStargatesStargateId**](docs/UniverseApi.md#getuniversestargatesstargateid) | **GET** /universe/stargates/{stargate_id}/ | Get stargate information
*UniverseApi* | [**getUniverseStarsStarId**](docs/UniverseApi.md#getuniversestarsstarid) | **GET** /universe/stars/{star_id}/ | Get star information
*UniverseApi* | [**getUniverseStationsStationId**](docs/UniverseApi.md#getuniversestationsstationid) | **GET** /universe/stations/{station_id}/ | Get station information
*UniverseApi* | [**getUniverseStructures**](docs/UniverseApi.md#getuniversestructures) | **GET** /universe/structures/ | List all public structures
*UniverseApi* | [**getUniverseStructuresStructureId**](docs/UniverseApi.md#getuniversestructuresstructureid) | **GET** /universe/structures/{structure_id}/ | Get structure information
*UniverseApi* | [**getUniverseSystemJumps**](docs/UniverseApi.md#getuniversesystemjumps) | **GET** /universe/system_jumps/ | Get system jumps
*UniverseApi* | [**getUniverseSystemKills**](docs/UniverseApi.md#getuniversesystemkills) | **GET** /universe/system_kills/ | Get system kills
*UniverseApi* | [**getUniverseSystems**](docs/UniverseApi.md#getuniversesystems) | **GET** /universe/systems/ | Get solar systems
*UniverseApi* | [**getUniverseSystemsSystemId**](docs/UniverseApi.md#getuniversesystemssystemid) | **GET** /universe/systems/{system_id}/ | Get solar system information
*UniverseApi* | [**getUniverseTypes**](docs/UniverseApi.md#getuniversetypes) | **GET** /universe/types/ | Get types
*UniverseApi* | [**getUniverseTypesTypeId**](docs/UniverseApi.md#getuniversetypestypeid) | **GET** /universe/types/{type_id}/ | Get type information
*UniverseApi* | [**postUniverseIds**](docs/UniverseApi.md#postuniverseids) | **POST** /universe/ids/ | Bulk names to IDs
*UniverseApi* | [**postUniverseNames**](docs/UniverseApi.md#postuniversenames) | **POST** /universe/names/ | Get names and categories for a set of IDs
*UserInterfaceApi* | [**postUiAutopilotWaypoint**](docs/UserInterfaceApi.md#postuiautopilotwaypoint) | **POST** /ui/autopilot/waypoint/ | Set Autopilot Waypoint
*UserInterfaceApi* | [**postUiOpenwindowContract**](docs/UserInterfaceApi.md#postuiopenwindowcontract) | **POST** /ui/openwindow/contract/ | Open Contract Window
*UserInterfaceApi* | [**postUiOpenwindowInformation**](docs/UserInterfaceApi.md#postuiopenwindowinformation) | **POST** /ui/openwindow/information/ | Open Information Window
*UserInterfaceApi* | [**postUiOpenwindowMarketdetails**](docs/UserInterfaceApi.md#postuiopenwindowmarketdetails) | **POST** /ui/openwindow/marketdetails/ | Open Market Details
*UserInterfaceApi* | [**postUiOpenwindowNewmail**](docs/UserInterfaceApi.md#postuiopenwindownewmail) | **POST** /ui/openwindow/newmail/ | Open New Mail Window
*WalletApi* | [**getCharactersCharacterIdWallet**](docs/WalletApi.md#getcharacterscharacteridwallet) | **GET** /characters/{character_id}/wallet/ | Get a character's wallet balance
*WalletApi* | [**getCharactersCharacterIdWalletJournal**](docs/WalletApi.md#getcharacterscharacteridwalletjournal) | **GET** /characters/{character_id}/wallet/journal/ | Get character wallet journal
*WalletApi* | [**getCharactersCharacterIdWalletTransactions**](docs/WalletApi.md#getcharacterscharacteridwallettransactions) | **GET** /characters/{character_id}/wallet/transactions/ | Get wallet transactions
*WalletApi* | [**getCorporationsCorporationIdWallets**](docs/WalletApi.md#getcorporationscorporationidwallets) | **GET** /corporations/{corporation_id}/wallets/ | Returns a corporation's wallet balance
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionJournal**](docs/WalletApi.md#getcorporationscorporationidwalletsdivisionjournal) | **GET** /corporations/{corporation_id}/wallets/{division}/journal/ | Get corporation wallet journal
*WalletApi* | [**getCorporationsCorporationIdWalletsDivisionTransactions**](docs/WalletApi.md#getcorporationscorporationidwalletsdivisiontransactions) | **GET** /corporations/{corporation_id}/wallets/{division}/transactions/ | Get corporation wallet transactions
*WarsApi* | [**getWars**](docs/WarsApi.md#getwars) | **GET** /wars/ | List wars
*WarsApi* | [**getWarsWarId**](docs/WarsApi.md#getwarswarid) | **GET** /wars/{war_id}/ | Get war information
*WarsApi* | [**getWarsWarIdKillmails**](docs/WarsApi.md#getwarswaridkillmails) | **GET** /wars/{war_id}/killmails/ | List kills for a war


<a name="documentation-for-models"></a>
## Documentation for Models

 - [tv.z85.esi.models.BadRequest](docs/BadRequest.md)
 - [tv.z85.esi.models.DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity](docs/DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity.md)
 - [tv.z85.esi.models.DeleteFleetsFleetIdMembersMemberIdNotFound](docs/DeleteFleetsFleetIdMembersMemberIdNotFound.md)
 - [tv.z85.esi.models.DeleteFleetsFleetIdSquadsSquadIdNotFound](docs/DeleteFleetsFleetIdSquadsSquadIdNotFound.md)
 - [tv.z85.esi.models.DeleteFleetsFleetIdWingsWingIdNotFound](docs/DeleteFleetsFleetIdWingsWingIdNotFound.md)
 - [tv.z85.esi.models.ErrorLimited](docs/ErrorLimited.md)
 - [tv.z85.esi.models.Forbidden](docs/Forbidden.md)
 - [tv.z85.esi.models.GatewayTimeout](docs/GatewayTimeout.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdContacts200Ok](docs/GetAlliancesAllianceIdContacts200Ok.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdContactsLabels200Ok](docs/GetAlliancesAllianceIdContactsLabels200Ok.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdIconsNotFound](docs/GetAlliancesAllianceIdIconsNotFound.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdIconsOk](docs/GetAlliancesAllianceIdIconsOk.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdNotFound](docs/GetAlliancesAllianceIdNotFound.md)
 - [tv.z85.esi.models.GetAlliancesAllianceIdOk](docs/GetAlliancesAllianceIdOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdAgentsResearch200Ok](docs/GetCharactersCharacterIdAgentsResearch200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdAssets200Ok](docs/GetCharactersCharacterIdAssets200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdAttributesOk](docs/GetCharactersCharacterIdAttributesOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdBlueprints200Ok](docs/GetCharactersCharacterIdBlueprints200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdBookmarks200Ok](docs/GetCharactersCharacterIdBookmarks200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdBookmarksCoordinates](docs/GetCharactersCharacterIdBookmarksCoordinates.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdBookmarksFolders200Ok](docs/GetCharactersCharacterIdBookmarksFolders200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdBookmarksItem](docs/GetCharactersCharacterIdBookmarksItem.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCalendar200Ok](docs/GetCharactersCharacterIdCalendar200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCalendarEventIdAttendees200Ok](docs/GetCharactersCharacterIdCalendarEventIdAttendees200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCalendarEventIdAttendeesNotFound](docs/GetCharactersCharacterIdCalendarEventIdAttendeesNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCalendarEventIdNotFound](docs/GetCharactersCharacterIdCalendarEventIdNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCalendarEventIdOk](docs/GetCharactersCharacterIdCalendarEventIdOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdClonesHomeLocation](docs/GetCharactersCharacterIdClonesHomeLocation.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdClonesJumpClone](docs/GetCharactersCharacterIdClonesJumpClone.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdClonesOk](docs/GetCharactersCharacterIdClonesOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContacts200Ok](docs/GetCharactersCharacterIdContacts200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContactsLabels200Ok](docs/GetCharactersCharacterIdContactsLabels200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContracts200Ok](docs/GetCharactersCharacterIdContracts200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContractsContractIdBids200Ok](docs/GetCharactersCharacterIdContractsContractIdBids200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContractsContractIdBidsNotFound](docs/GetCharactersCharacterIdContractsContractIdBidsNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContractsContractIdItems200Ok](docs/GetCharactersCharacterIdContractsContractIdItems200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdContractsContractIdItemsNotFound](docs/GetCharactersCharacterIdContractsContractIdItemsNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdCorporationhistory200Ok](docs/GetCharactersCharacterIdCorporationhistory200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFatigueOk](docs/GetCharactersCharacterIdFatigueOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFittings200Ok](docs/GetCharactersCharacterIdFittings200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFittingsItem](docs/GetCharactersCharacterIdFittingsItem.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFleetNotFound](docs/GetCharactersCharacterIdFleetNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFleetOk](docs/GetCharactersCharacterIdFleetOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFwStatsKills](docs/GetCharactersCharacterIdFwStatsKills.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFwStatsOk](docs/GetCharactersCharacterIdFwStatsOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdFwStatsVictoryPoints](docs/GetCharactersCharacterIdFwStatsVictoryPoints.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdIndustryJobs200Ok](docs/GetCharactersCharacterIdIndustryJobs200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdKillmailsRecent200Ok](docs/GetCharactersCharacterIdKillmailsRecent200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdLocationOk](docs/GetCharactersCharacterIdLocationOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdLoyaltyPoints200Ok](docs/GetCharactersCharacterIdLoyaltyPoints200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMail200Ok](docs/GetCharactersCharacterIdMail200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailLabelsLabel](docs/GetCharactersCharacterIdMailLabelsLabel.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailLabelsOk](docs/GetCharactersCharacterIdMailLabelsOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailLists200Ok](docs/GetCharactersCharacterIdMailLists200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailMailIdNotFound](docs/GetCharactersCharacterIdMailMailIdNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailMailIdOk](docs/GetCharactersCharacterIdMailMailIdOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailMailIdRecipient](docs/GetCharactersCharacterIdMailMailIdRecipient.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMailRecipient](docs/GetCharactersCharacterIdMailRecipient.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMedals200Ok](docs/GetCharactersCharacterIdMedals200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMedalsGraphic](docs/GetCharactersCharacterIdMedalsGraphic.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdMining200Ok](docs/GetCharactersCharacterIdMining200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdNotFound](docs/GetCharactersCharacterIdNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdNotifications200Ok](docs/GetCharactersCharacterIdNotifications200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdNotificationsContacts200Ok](docs/GetCharactersCharacterIdNotificationsContacts200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdOk](docs/GetCharactersCharacterIdOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdOnlineOk](docs/GetCharactersCharacterIdOnlineOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdOpportunities200Ok](docs/GetCharactersCharacterIdOpportunities200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdOrders200Ok](docs/GetCharactersCharacterIdOrders200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdOrdersHistory200Ok](docs/GetCharactersCharacterIdOrdersHistory200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanets200Ok](docs/GetCharactersCharacterIdPlanets200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdContent](docs/GetCharactersCharacterIdPlanetsPlanetIdContent.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails](docs/GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails](docs/GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdHead](docs/GetCharactersCharacterIdPlanetsPlanetIdHead.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdLink](docs/GetCharactersCharacterIdPlanetsPlanetIdLink.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdNotFound](docs/GetCharactersCharacterIdPlanetsPlanetIdNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdOk](docs/GetCharactersCharacterIdPlanetsPlanetIdOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdPin](docs/GetCharactersCharacterIdPlanetsPlanetIdPin.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPlanetsPlanetIdRoute](docs/GetCharactersCharacterIdPlanetsPlanetIdRoute.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPortraitNotFound](docs/GetCharactersCharacterIdPortraitNotFound.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdPortraitOk](docs/GetCharactersCharacterIdPortraitOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdRolesOk](docs/GetCharactersCharacterIdRolesOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdSearchOk](docs/GetCharactersCharacterIdSearchOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdShipOk](docs/GetCharactersCharacterIdShipOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdSkillqueue200Ok](docs/GetCharactersCharacterIdSkillqueue200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdSkillsOk](docs/GetCharactersCharacterIdSkillsOk.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdSkillsSkill](docs/GetCharactersCharacterIdSkillsSkill.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdStandings200Ok](docs/GetCharactersCharacterIdStandings200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdTitles200Ok](docs/GetCharactersCharacterIdTitles200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdWalletJournal200Ok](docs/GetCharactersCharacterIdWalletJournal200Ok.md)
 - [tv.z85.esi.models.GetCharactersCharacterIdWalletTransactions200Ok](docs/GetCharactersCharacterIdWalletTransactions200Ok.md)
 - [tv.z85.esi.models.GetContractsPublicBidsContractId200Ok](docs/GetContractsPublicBidsContractId200Ok.md)
 - [tv.z85.esi.models.GetContractsPublicBidsContractIdForbidden](docs/GetContractsPublicBidsContractIdForbidden.md)
 - [tv.z85.esi.models.GetContractsPublicBidsContractIdNotFound](docs/GetContractsPublicBidsContractIdNotFound.md)
 - [tv.z85.esi.models.GetContractsPublicItemsContractId200Ok](docs/GetContractsPublicItemsContractId200Ok.md)
 - [tv.z85.esi.models.GetContractsPublicItemsContractIdForbidden](docs/GetContractsPublicItemsContractIdForbidden.md)
 - [tv.z85.esi.models.GetContractsPublicItemsContractIdNotFound](docs/GetContractsPublicItemsContractIdNotFound.md)
 - [tv.z85.esi.models.GetContractsPublicRegionId200Ok](docs/GetContractsPublicRegionId200Ok.md)
 - [tv.z85.esi.models.GetContractsPublicRegionIdNotFound](docs/GetContractsPublicRegionIdNotFound.md)
 - [tv.z85.esi.models.GetCorporationCorporationIdMiningExtractions200Ok](docs/GetCorporationCorporationIdMiningExtractions200Ok.md)
 - [tv.z85.esi.models.GetCorporationCorporationIdMiningObservers200Ok](docs/GetCorporationCorporationIdMiningObservers200Ok.md)
 - [tv.z85.esi.models.GetCorporationCorporationIdMiningObserversObserverId200Ok](docs/GetCorporationCorporationIdMiningObserversObserverId200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdAlliancehistory200Ok](docs/GetCorporationsCorporationIdAlliancehistory200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdAssets200Ok](docs/GetCorporationsCorporationIdAssets200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdBlueprints200Ok](docs/GetCorporationsCorporationIdBlueprints200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdBookmarks200Ok](docs/GetCorporationsCorporationIdBookmarks200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdBookmarksCoordinates](docs/GetCorporationsCorporationIdBookmarksCoordinates.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdBookmarksFolders200Ok](docs/GetCorporationsCorporationIdBookmarksFolders200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdBookmarksItem](docs/GetCorporationsCorporationIdBookmarksItem.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContacts200Ok](docs/GetCorporationsCorporationIdContacts200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContactsLabels200Ok](docs/GetCorporationsCorporationIdContactsLabels200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContainersLogs200Ok](docs/GetCorporationsCorporationIdContainersLogs200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContracts200Ok](docs/GetCorporationsCorporationIdContracts200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContractsContractIdBids200Ok](docs/GetCorporationsCorporationIdContractsContractIdBids200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContractsContractIdBidsNotFound](docs/GetCorporationsCorporationIdContractsContractIdBidsNotFound.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContractsContractIdItems200Ok](docs/GetCorporationsCorporationIdContractsContractIdItems200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContractsContractIdItemsError520](docs/GetCorporationsCorporationIdContractsContractIdItemsError520.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdContractsContractIdItemsNotFound](docs/GetCorporationsCorporationIdContractsContractIdItemsNotFound.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdCustomsOffices200Ok](docs/GetCorporationsCorporationIdCustomsOffices200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdDivisionsHangarHangar](docs/GetCorporationsCorporationIdDivisionsHangarHangar.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdDivisionsOk](docs/GetCorporationsCorporationIdDivisionsOk.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdDivisionsWalletWallet](docs/GetCorporationsCorporationIdDivisionsWalletWallet.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdFacilities200Ok](docs/GetCorporationsCorporationIdFacilities200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdFwStatsKills](docs/GetCorporationsCorporationIdFwStatsKills.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdFwStatsOk](docs/GetCorporationsCorporationIdFwStatsOk.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdFwStatsVictoryPoints](docs/GetCorporationsCorporationIdFwStatsVictoryPoints.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdIconsNotFound](docs/GetCorporationsCorporationIdIconsNotFound.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdIconsOk](docs/GetCorporationsCorporationIdIconsOk.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdIndustryJobs200Ok](docs/GetCorporationsCorporationIdIndustryJobs200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdKillmailsRecent200Ok](docs/GetCorporationsCorporationIdKillmailsRecent200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdMedals200Ok](docs/GetCorporationsCorporationIdMedals200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdMedalsIssued200Ok](docs/GetCorporationsCorporationIdMedalsIssued200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdMembersTitles200Ok](docs/GetCorporationsCorporationIdMembersTitles200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdMembertracking200Ok](docs/GetCorporationsCorporationIdMembertracking200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdNotFound](docs/GetCorporationsCorporationIdNotFound.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdOk](docs/GetCorporationsCorporationIdOk.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdOrders200Ok](docs/GetCorporationsCorporationIdOrders200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdOrdersHistory200Ok](docs/GetCorporationsCorporationIdOrdersHistory200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdRoles200Ok](docs/GetCorporationsCorporationIdRoles200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdRolesHistory200Ok](docs/GetCorporationsCorporationIdRolesHistory200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdShareholders200Ok](docs/GetCorporationsCorporationIdShareholders200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStandings200Ok](docs/GetCorporationsCorporationIdStandings200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStarbases200Ok](docs/GetCorporationsCorporationIdStarbases200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStarbasesStarbaseIdFuel](docs/GetCorporationsCorporationIdStarbasesStarbaseIdFuel.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStarbasesStarbaseIdOk](docs/GetCorporationsCorporationIdStarbasesStarbaseIdOk.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStructures200Ok](docs/GetCorporationsCorporationIdStructures200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdStructuresService](docs/GetCorporationsCorporationIdStructuresService.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdTitles200Ok](docs/GetCorporationsCorporationIdTitles200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdWallets200Ok](docs/GetCorporationsCorporationIdWallets200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdWalletsDivisionJournal200Ok](docs/GetCorporationsCorporationIdWalletsDivisionJournal200Ok.md)
 - [tv.z85.esi.models.GetCorporationsCorporationIdWalletsDivisionTransactions200Ok](docs/GetCorporationsCorporationIdWalletsDivisionTransactions200Ok.md)
 - [tv.z85.esi.models.GetDogmaAttributesAttributeIdNotFound](docs/GetDogmaAttributesAttributeIdNotFound.md)
 - [tv.z85.esi.models.GetDogmaAttributesAttributeIdOk](docs/GetDogmaAttributesAttributeIdOk.md)
 - [tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute](docs/GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute.md)
 - [tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdDogmaEffect](docs/GetDogmaDynamicItemsTypeIdItemIdDogmaEffect.md)
 - [tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdNotFound](docs/GetDogmaDynamicItemsTypeIdItemIdNotFound.md)
 - [tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdOk](docs/GetDogmaDynamicItemsTypeIdItemIdOk.md)
 - [tv.z85.esi.models.GetDogmaEffectsEffectIdModifier](docs/GetDogmaEffectsEffectIdModifier.md)
 - [tv.z85.esi.models.GetDogmaEffectsEffectIdNotFound](docs/GetDogmaEffectsEffectIdNotFound.md)
 - [tv.z85.esi.models.GetDogmaEffectsEffectIdOk](docs/GetDogmaEffectsEffectIdOk.md)
 - [tv.z85.esi.models.GetFleetsFleetIdMembers200Ok](docs/GetFleetsFleetIdMembers200Ok.md)
 - [tv.z85.esi.models.GetFleetsFleetIdMembersNotFound](docs/GetFleetsFleetIdMembersNotFound.md)
 - [tv.z85.esi.models.GetFleetsFleetIdNotFound](docs/GetFleetsFleetIdNotFound.md)
 - [tv.z85.esi.models.GetFleetsFleetIdOk](docs/GetFleetsFleetIdOk.md)
 - [tv.z85.esi.models.GetFleetsFleetIdWings200Ok](docs/GetFleetsFleetIdWings200Ok.md)
 - [tv.z85.esi.models.GetFleetsFleetIdWingsNotFound](docs/GetFleetsFleetIdWingsNotFound.md)
 - [tv.z85.esi.models.GetFleetsFleetIdWingsSquad](docs/GetFleetsFleetIdWingsSquad.md)
 - [tv.z85.esi.models.GetFwLeaderboardsActiveTotalActiveTotal](docs/GetFwLeaderboardsActiveTotalActiveTotal.md)
 - [tv.z85.esi.models.GetFwLeaderboardsActiveTotalActiveTotal1](docs/GetFwLeaderboardsActiveTotalActiveTotal1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersActiveTotalActiveTotal](docs/GetFwLeaderboardsCharactersActiveTotalActiveTotal.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersActiveTotalActiveTotal1](docs/GetFwLeaderboardsCharactersActiveTotalActiveTotal1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersKills](docs/GetFwLeaderboardsCharactersKills.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersLastWeekLastWeek](docs/GetFwLeaderboardsCharactersLastWeekLastWeek.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersLastWeekLastWeek1](docs/GetFwLeaderboardsCharactersLastWeekLastWeek1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersOk](docs/GetFwLeaderboardsCharactersOk.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersVictoryPoints](docs/GetFwLeaderboardsCharactersVictoryPoints.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersYesterdayYesterday](docs/GetFwLeaderboardsCharactersYesterdayYesterday.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCharactersYesterdayYesterday1](docs/GetFwLeaderboardsCharactersYesterdayYesterday1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsActiveTotalActiveTotal](docs/GetFwLeaderboardsCorporationsActiveTotalActiveTotal.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsActiveTotalActiveTotal1](docs/GetFwLeaderboardsCorporationsActiveTotalActiveTotal1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsKills](docs/GetFwLeaderboardsCorporationsKills.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsLastWeekLastWeek](docs/GetFwLeaderboardsCorporationsLastWeekLastWeek.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsLastWeekLastWeek1](docs/GetFwLeaderboardsCorporationsLastWeekLastWeek1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsOk](docs/GetFwLeaderboardsCorporationsOk.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsVictoryPoints](docs/GetFwLeaderboardsCorporationsVictoryPoints.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsYesterdayYesterday](docs/GetFwLeaderboardsCorporationsYesterdayYesterday.md)
 - [tv.z85.esi.models.GetFwLeaderboardsCorporationsYesterdayYesterday1](docs/GetFwLeaderboardsCorporationsYesterdayYesterday1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsKills](docs/GetFwLeaderboardsKills.md)
 - [tv.z85.esi.models.GetFwLeaderboardsLastWeekLastWeek](docs/GetFwLeaderboardsLastWeekLastWeek.md)
 - [tv.z85.esi.models.GetFwLeaderboardsLastWeekLastWeek1](docs/GetFwLeaderboardsLastWeekLastWeek1.md)
 - [tv.z85.esi.models.GetFwLeaderboardsOk](docs/GetFwLeaderboardsOk.md)
 - [tv.z85.esi.models.GetFwLeaderboardsVictoryPoints](docs/GetFwLeaderboardsVictoryPoints.md)
 - [tv.z85.esi.models.GetFwLeaderboardsYesterdayYesterday](docs/GetFwLeaderboardsYesterdayYesterday.md)
 - [tv.z85.esi.models.GetFwLeaderboardsYesterdayYesterday1](docs/GetFwLeaderboardsYesterdayYesterday1.md)
 - [tv.z85.esi.models.GetFwStats200Ok](docs/GetFwStats200Ok.md)
 - [tv.z85.esi.models.GetFwStatsKills](docs/GetFwStatsKills.md)
 - [tv.z85.esi.models.GetFwStatsVictoryPoints](docs/GetFwStatsVictoryPoints.md)
 - [tv.z85.esi.models.GetFwSystems200Ok](docs/GetFwSystems200Ok.md)
 - [tv.z85.esi.models.GetFwWars200Ok](docs/GetFwWars200Ok.md)
 - [tv.z85.esi.models.GetIncursions200Ok](docs/GetIncursions200Ok.md)
 - [tv.z85.esi.models.GetIndustryFacilities200Ok](docs/GetIndustryFacilities200Ok.md)
 - [tv.z85.esi.models.GetIndustrySystems200Ok](docs/GetIndustrySystems200Ok.md)
 - [tv.z85.esi.models.GetIndustrySystemsCostIndice](docs/GetIndustrySystemsCostIndice.md)
 - [tv.z85.esi.models.GetInsurancePrices200Ok](docs/GetInsurancePrices200Ok.md)
 - [tv.z85.esi.models.GetInsurancePricesLevel](docs/GetInsurancePricesLevel.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashAttacker](docs/GetKillmailsKillmailIdKillmailHashAttacker.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashItem](docs/GetKillmailsKillmailIdKillmailHashItem.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashItemsItem](docs/GetKillmailsKillmailIdKillmailHashItemsItem.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashOk](docs/GetKillmailsKillmailIdKillmailHashOk.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashPosition](docs/GetKillmailsKillmailIdKillmailHashPosition.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashUnprocessableEntity](docs/GetKillmailsKillmailIdKillmailHashUnprocessableEntity.md)
 - [tv.z85.esi.models.GetKillmailsKillmailIdKillmailHashVictim](docs/GetKillmailsKillmailIdKillmailHashVictim.md)
 - [tv.z85.esi.models.GetLoyaltyStoresCorporationIdOffers200Ok](docs/GetLoyaltyStoresCorporationIdOffers200Ok.md)
 - [tv.z85.esi.models.GetLoyaltyStoresCorporationIdOffersNotFound](docs/GetLoyaltyStoresCorporationIdOffersNotFound.md)
 - [tv.z85.esi.models.GetLoyaltyStoresCorporationIdOffersRequiredItem](docs/GetLoyaltyStoresCorporationIdOffersRequiredItem.md)
 - [tv.z85.esi.models.GetMarketsGroupsMarketGroupIdNotFound](docs/GetMarketsGroupsMarketGroupIdNotFound.md)
 - [tv.z85.esi.models.GetMarketsGroupsMarketGroupIdOk](docs/GetMarketsGroupsMarketGroupIdOk.md)
 - [tv.z85.esi.models.GetMarketsPrices200Ok](docs/GetMarketsPrices200Ok.md)
 - [tv.z85.esi.models.GetMarketsRegionIdHistory200Ok](docs/GetMarketsRegionIdHistory200Ok.md)
 - [tv.z85.esi.models.GetMarketsRegionIdHistoryError520](docs/GetMarketsRegionIdHistoryError520.md)
 - [tv.z85.esi.models.GetMarketsRegionIdHistoryNotFound](docs/GetMarketsRegionIdHistoryNotFound.md)
 - [tv.z85.esi.models.GetMarketsRegionIdHistoryUnprocessableEntity](docs/GetMarketsRegionIdHistoryUnprocessableEntity.md)
 - [tv.z85.esi.models.GetMarketsRegionIdOrders200Ok](docs/GetMarketsRegionIdOrders200Ok.md)
 - [tv.z85.esi.models.GetMarketsRegionIdOrdersNotFound](docs/GetMarketsRegionIdOrdersNotFound.md)
 - [tv.z85.esi.models.GetMarketsRegionIdOrdersUnprocessableEntity](docs/GetMarketsRegionIdOrdersUnprocessableEntity.md)
 - [tv.z85.esi.models.GetMarketsStructuresStructureId200Ok](docs/GetMarketsStructuresStructureId200Ok.md)
 - [tv.z85.esi.models.GetOpportunitiesGroupsGroupIdOk](docs/GetOpportunitiesGroupsGroupIdOk.md)
 - [tv.z85.esi.models.GetOpportunitiesTasksTaskIdOk](docs/GetOpportunitiesTasksTaskIdOk.md)
 - [tv.z85.esi.models.GetRouteOriginDestinationNotFound](docs/GetRouteOriginDestinationNotFound.md)
 - [tv.z85.esi.models.GetSearchOk](docs/GetSearchOk.md)
 - [tv.z85.esi.models.GetSovereigntyCampaigns200Ok](docs/GetSovereigntyCampaigns200Ok.md)
 - [tv.z85.esi.models.GetSovereigntyCampaignsParticipant](docs/GetSovereigntyCampaignsParticipant.md)
 - [tv.z85.esi.models.GetSovereigntyMap200Ok](docs/GetSovereigntyMap200Ok.md)
 - [tv.z85.esi.models.GetSovereigntyStructures200Ok](docs/GetSovereigntyStructures200Ok.md)
 - [tv.z85.esi.models.GetStatusOk](docs/GetStatusOk.md)
 - [tv.z85.esi.models.GetUniverseAncestries200Ok](docs/GetUniverseAncestries200Ok.md)
 - [tv.z85.esi.models.GetUniverseAsteroidBeltsAsteroidBeltIdNotFound](docs/GetUniverseAsteroidBeltsAsteroidBeltIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseAsteroidBeltsAsteroidBeltIdOk](docs/GetUniverseAsteroidBeltsAsteroidBeltIdOk.md)
 - [tv.z85.esi.models.GetUniverseAsteroidBeltsAsteroidBeltIdPosition](docs/GetUniverseAsteroidBeltsAsteroidBeltIdPosition.md)
 - [tv.z85.esi.models.GetUniverseBloodlines200Ok](docs/GetUniverseBloodlines200Ok.md)
 - [tv.z85.esi.models.GetUniverseCategoriesCategoryIdNotFound](docs/GetUniverseCategoriesCategoryIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseCategoriesCategoryIdOk](docs/GetUniverseCategoriesCategoryIdOk.md)
 - [tv.z85.esi.models.GetUniverseConstellationsConstellationIdNotFound](docs/GetUniverseConstellationsConstellationIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseConstellationsConstellationIdOk](docs/GetUniverseConstellationsConstellationIdOk.md)
 - [tv.z85.esi.models.GetUniverseConstellationsConstellationIdPosition](docs/GetUniverseConstellationsConstellationIdPosition.md)
 - [tv.z85.esi.models.GetUniverseFactions200Ok](docs/GetUniverseFactions200Ok.md)
 - [tv.z85.esi.models.GetUniverseGraphicsGraphicIdNotFound](docs/GetUniverseGraphicsGraphicIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseGraphicsGraphicIdOk](docs/GetUniverseGraphicsGraphicIdOk.md)
 - [tv.z85.esi.models.GetUniverseGroupsGroupIdNotFound](docs/GetUniverseGroupsGroupIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseGroupsGroupIdOk](docs/GetUniverseGroupsGroupIdOk.md)
 - [tv.z85.esi.models.GetUniverseMoonsMoonIdNotFound](docs/GetUniverseMoonsMoonIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseMoonsMoonIdOk](docs/GetUniverseMoonsMoonIdOk.md)
 - [tv.z85.esi.models.GetUniverseMoonsMoonIdPosition](docs/GetUniverseMoonsMoonIdPosition.md)
 - [tv.z85.esi.models.GetUniversePlanetsPlanetIdNotFound](docs/GetUniversePlanetsPlanetIdNotFound.md)
 - [tv.z85.esi.models.GetUniversePlanetsPlanetIdOk](docs/GetUniversePlanetsPlanetIdOk.md)
 - [tv.z85.esi.models.GetUniversePlanetsPlanetIdPosition](docs/GetUniversePlanetsPlanetIdPosition.md)
 - [tv.z85.esi.models.GetUniverseRaces200Ok](docs/GetUniverseRaces200Ok.md)
 - [tv.z85.esi.models.GetUniverseRegionsRegionIdNotFound](docs/GetUniverseRegionsRegionIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseRegionsRegionIdOk](docs/GetUniverseRegionsRegionIdOk.md)
 - [tv.z85.esi.models.GetUniverseSchematicsSchematicIdNotFound](docs/GetUniverseSchematicsSchematicIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseSchematicsSchematicIdOk](docs/GetUniverseSchematicsSchematicIdOk.md)
 - [tv.z85.esi.models.GetUniverseStargatesStargateIdDestination](docs/GetUniverseStargatesStargateIdDestination.md)
 - [tv.z85.esi.models.GetUniverseStargatesStargateIdNotFound](docs/GetUniverseStargatesStargateIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseStargatesStargateIdOk](docs/GetUniverseStargatesStargateIdOk.md)
 - [tv.z85.esi.models.GetUniverseStargatesStargateIdPosition](docs/GetUniverseStargatesStargateIdPosition.md)
 - [tv.z85.esi.models.GetUniverseStarsStarIdOk](docs/GetUniverseStarsStarIdOk.md)
 - [tv.z85.esi.models.GetUniverseStationsStationIdNotFound](docs/GetUniverseStationsStationIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseStationsStationIdOk](docs/GetUniverseStationsStationIdOk.md)
 - [tv.z85.esi.models.GetUniverseStationsStationIdPosition](docs/GetUniverseStationsStationIdPosition.md)
 - [tv.z85.esi.models.GetUniverseStructuresStructureIdNotFound](docs/GetUniverseStructuresStructureIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseStructuresStructureIdOk](docs/GetUniverseStructuresStructureIdOk.md)
 - [tv.z85.esi.models.GetUniverseStructuresStructureIdPosition](docs/GetUniverseStructuresStructureIdPosition.md)
 - [tv.z85.esi.models.GetUniverseSystemJumps200Ok](docs/GetUniverseSystemJumps200Ok.md)
 - [tv.z85.esi.models.GetUniverseSystemKills200Ok](docs/GetUniverseSystemKills200Ok.md)
 - [tv.z85.esi.models.GetUniverseSystemsSystemIdNotFound](docs/GetUniverseSystemsSystemIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseSystemsSystemIdOk](docs/GetUniverseSystemsSystemIdOk.md)
 - [tv.z85.esi.models.GetUniverseSystemsSystemIdPlanet](docs/GetUniverseSystemsSystemIdPlanet.md)
 - [tv.z85.esi.models.GetUniverseSystemsSystemIdPosition](docs/GetUniverseSystemsSystemIdPosition.md)
 - [tv.z85.esi.models.GetUniverseTypesTypeIdDogmaAttribute](docs/GetUniverseTypesTypeIdDogmaAttribute.md)
 - [tv.z85.esi.models.GetUniverseTypesTypeIdDogmaEffect](docs/GetUniverseTypesTypeIdDogmaEffect.md)
 - [tv.z85.esi.models.GetUniverseTypesTypeIdNotFound](docs/GetUniverseTypesTypeIdNotFound.md)
 - [tv.z85.esi.models.GetUniverseTypesTypeIdOk](docs/GetUniverseTypesTypeIdOk.md)
 - [tv.z85.esi.models.GetWarsWarIdAggressor](docs/GetWarsWarIdAggressor.md)
 - [tv.z85.esi.models.GetWarsWarIdAlly](docs/GetWarsWarIdAlly.md)
 - [tv.z85.esi.models.GetWarsWarIdDefender](docs/GetWarsWarIdDefender.md)
 - [tv.z85.esi.models.GetWarsWarIdKillmails200Ok](docs/GetWarsWarIdKillmails200Ok.md)
 - [tv.z85.esi.models.GetWarsWarIdKillmailsUnprocessableEntity](docs/GetWarsWarIdKillmailsUnprocessableEntity.md)
 - [tv.z85.esi.models.GetWarsWarIdOk](docs/GetWarsWarIdOk.md)
 - [tv.z85.esi.models.GetWarsWarIdUnprocessableEntity](docs/GetWarsWarIdUnprocessableEntity.md)
 - [tv.z85.esi.models.InternalServerError](docs/InternalServerError.md)
 - [tv.z85.esi.models.PostCharactersAffiliation200Ok](docs/PostCharactersAffiliation200Ok.md)
 - [tv.z85.esi.models.PostCharactersAffiliationNotFound](docs/PostCharactersAffiliationNotFound.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdAssetsLocations200Ok](docs/PostCharactersCharacterIdAssetsLocations200Ok.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdAssetsLocationsPosition](docs/PostCharactersCharacterIdAssetsLocationsPosition.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdAssetsNames200Ok](docs/PostCharactersCharacterIdAssetsNames200Ok.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdContactsError520](docs/PostCharactersCharacterIdContactsError520.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdFittingsCreated](docs/PostCharactersCharacterIdFittingsCreated.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdFittingsFitting](docs/PostCharactersCharacterIdFittingsFitting.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdFittingsItem](docs/PostCharactersCharacterIdFittingsItem.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdMailError520](docs/PostCharactersCharacterIdMailError520.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdMailLabelsLabel](docs/PostCharactersCharacterIdMailLabelsLabel.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdMailMail](docs/PostCharactersCharacterIdMailMail.md)
 - [tv.z85.esi.models.PostCharactersCharacterIdMailRecipient](docs/PostCharactersCharacterIdMailRecipient.md)
 - [tv.z85.esi.models.PostCorporationsCorporationIdAssetsLocations200Ok](docs/PostCorporationsCorporationIdAssetsLocations200Ok.md)
 - [tv.z85.esi.models.PostCorporationsCorporationIdAssetsLocationsNotFound](docs/PostCorporationsCorporationIdAssetsLocationsNotFound.md)
 - [tv.z85.esi.models.PostCorporationsCorporationIdAssetsLocationsPosition](docs/PostCorporationsCorporationIdAssetsLocationsPosition.md)
 - [tv.z85.esi.models.PostCorporationsCorporationIdAssetsNames200Ok](docs/PostCorporationsCorporationIdAssetsNames200Ok.md)
 - [tv.z85.esi.models.PostCorporationsCorporationIdAssetsNamesNotFound](docs/PostCorporationsCorporationIdAssetsNamesNotFound.md)
 - [tv.z85.esi.models.PostFleetsFleetIdMembersInvitation](docs/PostFleetsFleetIdMembersInvitation.md)
 - [tv.z85.esi.models.PostFleetsFleetIdMembersNotFound](docs/PostFleetsFleetIdMembersNotFound.md)
 - [tv.z85.esi.models.PostFleetsFleetIdMembersUnprocessableEntity](docs/PostFleetsFleetIdMembersUnprocessableEntity.md)
 - [tv.z85.esi.models.PostFleetsFleetIdWingsCreated](docs/PostFleetsFleetIdWingsCreated.md)
 - [tv.z85.esi.models.PostFleetsFleetIdWingsNotFound](docs/PostFleetsFleetIdWingsNotFound.md)
 - [tv.z85.esi.models.PostFleetsFleetIdWingsWingIdSquadsCreated](docs/PostFleetsFleetIdWingsWingIdSquadsCreated.md)
 - [tv.z85.esi.models.PostFleetsFleetIdWingsWingIdSquadsNotFound](docs/PostFleetsFleetIdWingsWingIdSquadsNotFound.md)
 - [tv.z85.esi.models.PostUiOpenwindowNewmailNewMail](docs/PostUiOpenwindowNewmailNewMail.md)
 - [tv.z85.esi.models.PostUiOpenwindowNewmailUnprocessableEntity](docs/PostUiOpenwindowNewmailUnprocessableEntity.md)
 - [tv.z85.esi.models.PostUniverseIdsAgent](docs/PostUniverseIdsAgent.md)
 - [tv.z85.esi.models.PostUniverseIdsAlliance](docs/PostUniverseIdsAlliance.md)
 - [tv.z85.esi.models.PostUniverseIdsCharacter](docs/PostUniverseIdsCharacter.md)
 - [tv.z85.esi.models.PostUniverseIdsConstellation](docs/PostUniverseIdsConstellation.md)
 - [tv.z85.esi.models.PostUniverseIdsCorporation](docs/PostUniverseIdsCorporation.md)
 - [tv.z85.esi.models.PostUniverseIdsFaction](docs/PostUniverseIdsFaction.md)
 - [tv.z85.esi.models.PostUniverseIdsInventoryType](docs/PostUniverseIdsInventoryType.md)
 - [tv.z85.esi.models.PostUniverseIdsOk](docs/PostUniverseIdsOk.md)
 - [tv.z85.esi.models.PostUniverseIdsRegion](docs/PostUniverseIdsRegion.md)
 - [tv.z85.esi.models.PostUniverseIdsStation](docs/PostUniverseIdsStation.md)
 - [tv.z85.esi.models.PostUniverseIdsSystem](docs/PostUniverseIdsSystem.md)
 - [tv.z85.esi.models.PostUniverseNames200Ok](docs/PostUniverseNames200Ok.md)
 - [tv.z85.esi.models.PostUniverseNamesNotFound](docs/PostUniverseNamesNotFound.md)
 - [tv.z85.esi.models.PutCharactersCharacterIdCalendarEventIdResponse](docs/PutCharactersCharacterIdCalendarEventIdResponse.md)
 - [tv.z85.esi.models.PutCharactersCharacterIdMailMailIdContents](docs/PutCharactersCharacterIdMailMailIdContents.md)
 - [tv.z85.esi.models.PutFleetsFleetIdMembersMemberIdMovement](docs/PutFleetsFleetIdMembersMemberIdMovement.md)
 - [tv.z85.esi.models.PutFleetsFleetIdMembersMemberIdNotFound](docs/PutFleetsFleetIdMembersMemberIdNotFound.md)
 - [tv.z85.esi.models.PutFleetsFleetIdMembersMemberIdUnprocessableEntity](docs/PutFleetsFleetIdMembersMemberIdUnprocessableEntity.md)
 - [tv.z85.esi.models.PutFleetsFleetIdNewSettings](docs/PutFleetsFleetIdNewSettings.md)
 - [tv.z85.esi.models.PutFleetsFleetIdNotFound](docs/PutFleetsFleetIdNotFound.md)
 - [tv.z85.esi.models.PutFleetsFleetIdSquadsSquadIdNaming](docs/PutFleetsFleetIdSquadsSquadIdNaming.md)
 - [tv.z85.esi.models.PutFleetsFleetIdSquadsSquadIdNotFound](docs/PutFleetsFleetIdSquadsSquadIdNotFound.md)
 - [tv.z85.esi.models.PutFleetsFleetIdWingsWingIdNaming](docs/PutFleetsFleetIdWingsWingIdNaming.md)
 - [tv.z85.esi.models.PutFleetsFleetIdWingsWingIdNotFound](docs/PutFleetsFleetIdWingsWingIdNotFound.md)
 - [tv.z85.esi.models.ServiceUnavailable](docs/ServiceUnavailable.md)
 - [tv.z85.esi.models.Unauthorized](docs/Unauthorized.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="evesso"></a>
### evesso

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://login.eveonline.com/v2/oauth/authorize
- **Scopes**: 
  - esi-alliances.read_contacts.v1: EVE SSO scope esi-alliances.read_contacts.v1
  - esi-assets.read_assets.v1: EVE SSO scope esi-assets.read_assets.v1
  - esi-assets.read_corporation_assets.v1: EVE SSO scope esi-assets.read_corporation_assets.v1
  - esi-bookmarks.read_character_bookmarks.v1: EVE SSO scope esi-bookmarks.read_character_bookmarks.v1
  - esi-bookmarks.read_corporation_bookmarks.v1: EVE SSO scope esi-bookmarks.read_corporation_bookmarks.v1
  - esi-calendar.read_calendar_events.v1: EVE SSO scope esi-calendar.read_calendar_events.v1
  - esi-calendar.respond_calendar_events.v1: EVE SSO scope esi-calendar.respond_calendar_events.v1
  - esi-characters.read_agents_research.v1: EVE SSO scope esi-characters.read_agents_research.v1
  - esi-characters.read_blueprints.v1: EVE SSO scope esi-characters.read_blueprints.v1
  - esi-characters.read_contacts.v1: EVE SSO scope esi-characters.read_contacts.v1
  - esi-characters.read_corporation_roles.v1: EVE SSO scope esi-characters.read_corporation_roles.v1
  - esi-characters.read_fatigue.v1: EVE SSO scope esi-characters.read_fatigue.v1
  - esi-characters.read_fw_stats.v1: EVE SSO scope esi-characters.read_fw_stats.v1
  - esi-characters.read_loyalty.v1: EVE SSO scope esi-characters.read_loyalty.v1
  - esi-characters.read_medals.v1: EVE SSO scope esi-characters.read_medals.v1
  - esi-characters.read_notifications.v1: EVE SSO scope esi-characters.read_notifications.v1
  - esi-characters.read_opportunities.v1: EVE SSO scope esi-characters.read_opportunities.v1
  - esi-characters.read_standings.v1: EVE SSO scope esi-characters.read_standings.v1
  - esi-characters.read_titles.v1: EVE SSO scope esi-characters.read_titles.v1
  - esi-characters.write_contacts.v1: EVE SSO scope esi-characters.write_contacts.v1
  - esi-clones.read_clones.v1: EVE SSO scope esi-clones.read_clones.v1
  - esi-clones.read_implants.v1: EVE SSO scope esi-clones.read_implants.v1
  - esi-contracts.read_character_contracts.v1: EVE SSO scope esi-contracts.read_character_contracts.v1
  - esi-contracts.read_corporation_contracts.v1: EVE SSO scope esi-contracts.read_corporation_contracts.v1
  - esi-corporations.read_blueprints.v1: EVE SSO scope esi-corporations.read_blueprints.v1
  - esi-corporations.read_contacts.v1: EVE SSO scope esi-corporations.read_contacts.v1
  - esi-corporations.read_container_logs.v1: EVE SSO scope esi-corporations.read_container_logs.v1
  - esi-corporations.read_corporation_membership.v1: EVE SSO scope esi-corporations.read_corporation_membership.v1
  - esi-corporations.read_divisions.v1: EVE SSO scope esi-corporations.read_divisions.v1
  - esi-corporations.read_facilities.v1: EVE SSO scope esi-corporations.read_facilities.v1
  - esi-corporations.read_fw_stats.v1: EVE SSO scope esi-corporations.read_fw_stats.v1
  - esi-corporations.read_medals.v1: EVE SSO scope esi-corporations.read_medals.v1
  - esi-corporations.read_standings.v1: EVE SSO scope esi-corporations.read_standings.v1
  - esi-corporations.read_starbases.v1: EVE SSO scope esi-corporations.read_starbases.v1
  - esi-corporations.read_structures.v1: EVE SSO scope esi-corporations.read_structures.v1
  - esi-corporations.read_titles.v1: EVE SSO scope esi-corporations.read_titles.v1
  - esi-corporations.track_members.v1: EVE SSO scope esi-corporations.track_members.v1
  - esi-fittings.read_fittings.v1: EVE SSO scope esi-fittings.read_fittings.v1
  - esi-fittings.write_fittings.v1: EVE SSO scope esi-fittings.write_fittings.v1
  - esi-fleets.read_fleet.v1: EVE SSO scope esi-fleets.read_fleet.v1
  - esi-fleets.write_fleet.v1: EVE SSO scope esi-fleets.write_fleet.v1
  - esi-industry.read_character_jobs.v1: EVE SSO scope esi-industry.read_character_jobs.v1
  - esi-industry.read_character_mining.v1: EVE SSO scope esi-industry.read_character_mining.v1
  - esi-industry.read_corporation_jobs.v1: EVE SSO scope esi-industry.read_corporation_jobs.v1
  - esi-industry.read_corporation_mining.v1: EVE SSO scope esi-industry.read_corporation_mining.v1
  - esi-killmails.read_corporation_killmails.v1: EVE SSO scope esi-killmails.read_corporation_killmails.v1
  - esi-killmails.read_killmails.v1: EVE SSO scope esi-killmails.read_killmails.v1
  - esi-location.read_location.v1: EVE SSO scope esi-location.read_location.v1
  - esi-location.read_online.v1: EVE SSO scope esi-location.read_online.v1
  - esi-location.read_ship_type.v1: EVE SSO scope esi-location.read_ship_type.v1
  - esi-mail.organize_mail.v1: EVE SSO scope esi-mail.organize_mail.v1
  - esi-mail.read_mail.v1: EVE SSO scope esi-mail.read_mail.v1
  - esi-mail.send_mail.v1: EVE SSO scope esi-mail.send_mail.v1
  - esi-markets.read_character_orders.v1: EVE SSO scope esi-markets.read_character_orders.v1
  - esi-markets.read_corporation_orders.v1: EVE SSO scope esi-markets.read_corporation_orders.v1
  - esi-markets.structure_markets.v1: EVE SSO scope esi-markets.structure_markets.v1
  - esi-planets.manage_planets.v1: EVE SSO scope esi-planets.manage_planets.v1
  - esi-planets.read_customs_offices.v1: EVE SSO scope esi-planets.read_customs_offices.v1
  - esi-search.search_structures.v1: EVE SSO scope esi-search.search_structures.v1
  - esi-skills.read_skillqueue.v1: EVE SSO scope esi-skills.read_skillqueue.v1
  - esi-skills.read_skills.v1: EVE SSO scope esi-skills.read_skills.v1
  - esi-ui.open_window.v1: EVE SSO scope esi-ui.open_window.v1
  - esi-ui.write_waypoint.v1: EVE SSO scope esi-ui.write_waypoint.v1
  - esi-universe.read_structures.v1: EVE SSO scope esi-universe.read_structures.v1
  - esi-wallet.read_character_wallet.v1: EVE SSO scope esi-wallet.read_character_wallet.v1
  - esi-wallet.read_corporation_wallets.v1: EVE SSO scope esi-wallet.read_corporation_wallets.v1

