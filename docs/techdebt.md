- zdsRol to zgwRol translation for natuurlijk_persoon now removes the entire verblijfsplaats if one the its required field is missing from the input. Otherwise ZGW API will fail the validation.
- zdsRol to zgwRol translation only implements medewerker and natuurlijkPersoon as gerelateerde due to missing tesdata for others
- zdsRol to zgwRol translation only implements the roles: heeftBetrekkingOp, heeftAlsBelanghebbende, heeftAlsInitiator, heeftAlsUitvoerende and heeftAlsVerantwoordelijke due to missing testdata
- zdsRol to zgwRol translation only validates betrokkenetype and betrokkeneIndentificatie seperatly, but not if the relationship between them is correct. This is difficult to fix due to conditional validation based on a descriminator.
- zdsZaak to zgwZaak is not translating the possible geoJson information, due to no testdata.
- Getters assume a single page of results. Dealing with paging is not implemented