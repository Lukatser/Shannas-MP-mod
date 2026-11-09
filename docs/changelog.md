# Changelogs

This file establishes the authoritative changelog for the project beginning with v4.0.0. 
There have been tries to establish proper changelogs before but those usually were not exhaustive. Those can also be found here, but do not always show everything that has changed.

Changelogs are also seperately saved in the folder changelogs. These are merely provided as utility for the discord server, and might be shorter than the changelogs in this file. 

Versions contained in this file (descending):
 - [v4.0.0-rc.1](#v400-rc1--back-to-top) *(08.11.2026)*
 - [v3.25.2](#v3252--back-to-top) *(22.10.2026)*
 - [v3.25.1](#v3251--back-to-top) *(06.10.2026)*
 - [v3.24.3](#v3243--back-to-top) *(03.10.2026)*
 - [v3.24.2](#v3242--back-to-top) *(26.09.2026)* (sic!)
 - [v3.24.0](#v3240--back-to-top) *(26.09.2026)*


## v3.24.0 <small>[↑ Back to top](#changelogs)</small>
#### Cumulative changelog vs. vanilla Europa Universalis IV

> **Historical baseline:** This section is a reconstructed comparison of the
> Live branch at patch 3.24 against vanilla EU4. It is not an exhaustive
> record of changes introduced specifically in v3.24. nor does it cover all changes compared to vanilla

**Branch:** `Live`  
**Patch:** `3.24`  
**Git commit:** `5e2908ce277c047279b62a3144e979dc86d18de0`

This is a **current-state comparison against vanilla EU4**, not a version-by-version history. It describes the gameplay differences present on the `Live` branch at patch 3.24.

---

### 1. Core game rules

The mod changes a large number of global defines that affect warfare, diplomacy, economy and long campaigns.

##### Campaign and country rules
- End date extended to **31 December 1835**.
- Monarch power cap increased to **2000**.
- Maximum war exhaustion increased to **50**.
- Abandoning an idea group refunds **80%** of its cost.
- Female generals are always enabled.
- Female advisor chance increased to **35%**.
- Rulers can gain up to **4 additional personalities**, with extra personality checks every **7 years**.
- Artillery and naval barrages cost **25 military power**.
- Culture conversion base power cost reduced to **25**.
- Claim decay and core-loss timings are altered.
- The game supports up to **100 colonial nations**.

##### Diplomacy
- **10 Great Powers**.
- Up to **13 Free Cities**.
- Base truce length reduced to **2 years**, with scaled truces reaching **13 years**.
- Alliance formation is allowed down to **-100 relations**.
- Breaking an alliance has no forced cooldown penalty.
- Base diplomatic vassalisation development cap increased to **200**.
- War reparations are **15%**.
- Aggressive-expansion calculations are substantially altered, including reduced HRE-internal AE, reduced same-religion-group AE, reduced province-demand AE, reduced return-core AE, and a province AE cap of 30.

##### Government and administration
- Expand Administration and Centralize State costs/timings are changed.
- Centralizing a state takes **10 years**.
- AI tolerance for exceeding governing capacity is changed.

---

### 2. Combat and military rules

Combat is more terrain-sensitive and generally more punishing.

##### Global combat changes
- Armies cannot retreat for the first **8 days** of combat.
- Siege phases last **25 days**.
- Besieging forts requires **2�** the normal fort-level manpower multiplier.
- Crossing penalties are increased:
  - River: **-2**
  - Strait: **-3**
  - Naval landing: **-4**
- Long wars increase battle damage through a custom war-length damage modifier.
- Army drill provides up to **10% morale**.
- Leader generation and leader-power rules are altered.
- Supply-limit attrition is stronger.

##### Terrain
Terrain has been heavily rewritten.

Examples:
- **Forest:** +1 defender roll, -20% combat width.
- **Hills:** +1 defender roll, -25% combat width.
- **Woods:** +1 defender roll, -20% combat width.
- **Mountains:** +2 defender rolls, -75% combat width, +1 attrition.
- **Jungle:** +1 defender roll, -25% combat width, +0.5 attrition.
- **Marsh:** +2 defender rolls, -25% combat width.
- **Highlands:** +1 defender roll, -50% combat width.
- Farmlands/grasslands/savannah are substantially easier to supply than rough terrain.


---

### 3. Army professionalism

Army Professionalism milestones are considerably stronger than vanilla.

- **20%:** Supply Depots.
- **40%:** Refill Garrison.
- **60%:** Return manpower when disbanding.
- **80%:** +50% reserves organisation and +1 free leader.
- **100%:** -50% general cost, +5% discipline, +100% drill gain and +1 free leader.

---

### 4. Hegemons

All three hegemon types are reworked.

##### Economic Hegemon
Normally requires **1000 monthly income** and Great Power income supremacy.

Base:
- -0.10 monthly war exhaustion
- -5% development cost modifier
- +100% mercenary manpower

Scaling:
- +10% mercenary discipline
- +25% global goods-produced size
- -20% minimum autonomy in territories

Maximum:
- +20% governing capacity

##### Naval Hegemon
Normally requires **250 ships** and naval superiority among Great Powers.

Base:
- +20% ship trade power
- -0.10 monthly war exhaustion
- +10% naval engagement width modifier

Scaling:
- -20 subject liberty desire
- +200% sailors
- +15% heavy-ship combat ability

Maximum:
- +20% back-row artillery damage

##### Military Hegemon
Normally requires **500 regiments**.

Base:
- +1 monthly military power
- -0.10 monthly war exhaustion
- -10% province warscore cost

Scaling:
- +0.25 flat land morale
- -25% land attrition
- +25% reserves organisation

Maximum:
- **+1 attacker dice roll**

---

### 5. Idea groups and policies

Patch 3.24 uses the standard broad idea-group structure, but the groups themselves are heavily rebalanced.

There are **25 selectable basic/government idea groups** in the Live ideas file:
- 7 Administrative
- 7 Diplomatic
- 11 Military/government-military

Notable examples:

##### Innovative
- Up to -35% advisor cost from completion.
- -10% technology cost.
- -10% institution embracement cost.
- +25% institution spread.
- Extra policies and free policy slots.
- Reduced war exhaustion and additional splendor.

##### Humanist
- -5 national unrest.
- -10 years of separatism.
- +2 accepted cultures.
- -50% culture-promotion cost.
- +10% manpower and -2.5% all-power cost.
- +50% improve relations.
- Stronger parliament support.

##### Spy
- State claims and vassal-transfer CB access.
- -20% AE.
- Doubled insult power projection.
- Large spy offence/defence bonuses.
- Stronger assault, looting, privateering and rebel-support effects.
- Better diplomatic-vassalisation acceptance.

##### Naval
- -80% naval barrage cost.
- Stronger naval leaders.
- +20% ship durability.
- +25% marine allowance.
- +1 blockade siege progress.
- Reduced landing penalty.

##### Infrastructure
- -15% development cost as completion bonus.
- Prosperity and state-maintenance bonuses.
- Cheaper construction and infrastructure expansion.
- Faster movement.
- Cheaper Centers of Trade.
- Lower state governing cost.
- Lower fort maintenance.
- Faster construction and monument upgrades.

##### Court
A much stronger ruler/estate/state-management group:
- Monarch DIP skill.
- Ruler lifespan.
- Estate equilibrium and privilege capacity.
- Free concentrate development.
- Reform progress.
- No stability loss on monarch death.
- Splendor.
- Absolutism and absolutism effect.

The policy matrix is also extensively rewritten: the three policy files currently contain **203 policy definitions**.

---

### 6. Institutions

Institutions are extensively reworked: their bonuses, historical spread and regional catch-up rules differ from vanilla.

##### Institution bonuses
- **Feudalism:** +1 free leader pool.
- **Renaissance:** -5% development cost and -5% construction cost.
- **Printing Press:** -5% stability cost.
- **New World / Colonialism:** +10% provincial trade power.
- **Global Trade:** +1 merchant.
- **Manufactories:** +10% global goods-produced size.
- **Enlightenment:** -25% culture-conversion cost.
- **Industrialization:** +25% manpower and +15% tax.

##### Timing and spread
- Renaissance is historically dated to **1330** in Florence and is already established across much of Italy by 1444.
- Printing Press is historically dated to **1452** in Frankfurt.
- Colonialism/New World remains a 1500-era institution.
- Spread rules contain extensive regional catch-up dates for Europe, the Americas, Africa, the Middle East and Asia.
- Institutions progressively increase **trade-company efficiency**, from +20% at Feudalism up to +500% at Industrialization.

---

### 7. Colonization and overseas empires

##### Colonial regions
The mod defines **20 colonial regions**, including Canada, Louisiana, California, Mexico, Caribbean, Colombia, Peru, La Plata, Brazil, Australia, Columbia, Hudson Bay, New Amsterdam, Georgia, Honduras, Texas, Congo, New Zealand, South Africa and the Philippines.

##### Trade companies
There are **61 trade-company regions**, including trade-company zones across Europe as well as Africa and Asia.

This includes nodes such as English Channel, North Sea, L�beck, Baltic Sea, Sevilla, Genoa, Venice, Constantinople, Novgorod, Kiev, Persia, India, China, Japan and Polynesia.

##### Trade-company investments
Trade-company investments are rebalanced into stronger military, production, development, manpower and naval paths.

Examples:
- Defensive quarters increase local defensiveness and supply.
- Warehouses/depot investments increase production efficiency and trade power.
- Broker investments increase goods produced.
- Settlements/districts reduce development cost.
- Military administration can double local manpower and sailors.
- Unique 1000-ducat investments can grant force limit, trade steering, manpower/sailors or other country-wide benefits.

##### Colonial range
Patch 3.24 redistributes early colonial range:
- DIP 3 no longer gives the old +100 colonial range.
- DIP 5 gives +30 range.
- DIP 6 gives +70 range.
- DIP 7 continues the expansion with +115 range.

---

### 8. Subjects and liberty desire

Subject scaling is rebalanced.

- Standard vassal-style subjects use **0.15 liberty desire per development** instead of 0.25.
- Client vassals and client marches use only **0.05**.
- Colonial subjects use **0.15** instead of 0.10.
- Colonial subjects are prevented from gaining normal government rank.

Eyalets are also altered:
- Eyalet development contributes only 0.1 liberty desire per development.
- Eyalets transfer trade, pay a larger share of income and contribute force limit/manpower/sailors.
- Core Eyalets provide still larger contributions and can be integrated at a custom development cost.

---

### 9. Buildings and force-limit scaling

Patch 3.24 replaces the old province-triggered force-limit system with scripted scaling tied directly to province development.

##### Regimental Camp
- Base: +0.125 land force limit.
- Additional force limit scales upward every 5 development.
- Scaling reaches +3.75 at 75+ development.

##### Conscription Center
- Base: +0.25 land force limit.
- Additional scaling is roughly double the Regimental Camp.
- Scaling reaches +7.5 at 75+ development.

The correct modifier is recalculated when the building is constructed/upgraded, province development changes, development is exploited, development is concentrated, and during periodic five-year maintenance checks.

---

### 10. Espionage and diplomatic actions

##### Support Heir
Monarchies can use a large spy network and money to support a foreign heir/dynasty candidate, with costs scaling by target rank and a long cooldown.

##### Force Tributary CB
The Emperor of China can spend spy network to obtain a temporary Force Tributary CB:
- normally 80 spy network,
- reduced to 40 with completed Spy Ideas.

---

### 11. Netherlands and the VOC

The Netherlands can create a true VOC subject.

When established:
- Dutch-owned provinces in India and the East Indies are transferred to the VOC.
- VOC becomes a **Commercial Enterprise** subject.
- It receives a trade-company government, the overlord's religion/culture/technology group, large starting monarch power and treasury, and permanent claims across India and the East Indies.
- A later decision transfers further Dutch conquests to the VOC.

---

### 12. Multiplayer stalemate system

The mod contains a custom multiplayer anti-stalemate system.

- Up to three wars can be tracked simultaneously.
- Once activated, a war receives a **36-month stalemate timer**.
- A qualifying siege victory resets the timer to 36 months.
- The system cleans itself up when the tracked war ends.
- Dedicated decisions/events are used to declare and enforce stalemate handling.

---

### 13. Estates

Patch 3.24 adds a set of early-game estate advisor privileges.

New advisor privileges exist for:
- Nobility
- Burghers
- Clergy
- Rajputs
- Marathas
- Brahmins
- Vaishyas
- Ghulams

They generally trade:
- **-15% advisor cost** in the estate's monarch-power category,
- estate loyalty/influence,
- higher stability cost,
- and reduced maximum absolutism.

Most are restricted to smaller countries, giving sub-100-development states an additional early-game estate choice.

---

### 14. Advisors and ruler personalities

- **79 additional advisor types** are defined.
- **69 additional ruler personalities** are defined.

These include court, religious, administrative, trade, colonial, naval, military and estate-specific roles and traits.

---

### 15. Government reforms and mechanics

The government system is substantially expanded beyond vanilla.

The branch includes custom mechanics for, among others:
- Imperial Grace
- Imperial Control
- Bureaucracy vs. Military
- Catholics vs. Utraquists
- Crusade Power
- Italian Condottieri
- Italian Dynasties
- Legitimation through Representation
- Liberalism
- Maritime Republics
- Political Focus
- Republican vs. Monarchist politics
- Rajput principalities
- Sicilian government
- Venetian government
- Pratihara mechanics

There are also many additional country- and region-specific reforms for Europe, India, Persia, Africa and East Asia.

---

### 16. Monuments

Three major custom monuments are added.

##### Fortress of Luxembourg
A very powerful defensive monument with fort levels, garrison size, defender dice, defensiveness and hostile attrition.

##### Rock of Gibraltar
Focused on controlling Gibraltar with fort levels, supply, hostile fleet attrition, very high defensiveness and defender dice at tier 3.

##### Hohenzollern Castle
Provides prestige and defensive bonuses, with much stronger conditional military bonuses when owned by the **von Hohenzollern** dynasty.

---

### 17. Events, disasters and historical content

The mod bundles a large amount of extra historical/flavour content beyond vanilla.

Notable additional or expanded disaster/event systems include:
- Decline of the Ottomans
- Mughal crisis/decline
- Bahmani decline
- Vijayanagar decline
- Partition of Poland
- Portuguese Succession Crisis
- Rampjaar
- Pashtun Uprising
- Zemene Mesafint
- Habsburg-monarchy division
- Italian republican crises
- Vijayabahu Kollaya
- Fall of Cromwell
- Chmielnicki uprising

There are also large country-event packages for Austria, France, Britain, Iberia, Russia, Persia, India, the Netherlands, Italy, the HRE and many smaller countries.

---

### 18. Country, map and historical setup changes

The Live branch contains extensive country-history, province-history, diplomacy and tag changes.

These include:
- altered 1444 country/province setups,
- additional formable or alternate states,
- custom country names and colours,
- expanded colonial naming,
- modified HRE history/diplomacy,
- changes across Oceania and other underrepresented regions,
- and many country-specific historical adjustments.

The mod therefore should not be treated as vanilla's 1444 map with only balance changes; its historical setup is materially different.

---

### 19. Patch 3.24 release highlights

While the rest of this document is cumulative versus vanilla, the **3.24 release itself** is especially centered on:

- Development-scaled force-limit buildings.
- Replacement of the old triggered-modifier force-limit system.
- New estate advisor privileges.
- Reworked Humanist government-reform requirements/effects.
- Redistribution of early colonial range across DIP technology.
- Further colonial-region and trade-company restructuring.
- New/reworked trade-company investments.
- Stalemate-system revisions.
- Several map/history cleanup changes.

## v3.24.2 <small>[↑ Back to top](#changelogs)</small>

**Compared against:** 3.24  
**3.24 commit:** `5e2908ce277c047279b62a3144e979dc86d18de0`  
**3.24.2 commit:** `d10ad43416aa49935f9d5199310bf914bed74df2`

This changelog compares the actual repository snapshots of 3.24 and 3.24.2, so intermediate unnumbered commits and 3.24.1 are only represented where their changes still exist in 3.24.2.

#### Age modifier system

- Reworked the large age-based triggered-modifier system.
- **88 triggered modifiers** were moved out of `common/triggered_modifiers/` and rebuilt as normal country modifiers controlled through scripted effects and on-actions.
- The new system refreshes applicable age bonuses during a yearly pulse and refreshes/cleans them when a new age begins.
- This covers:
  - **30** Age of Discovery modifiers
  - **21** Age of Reformation modifiers
  - **15** Age of Absolutism modifiers
  - **5** industrial/imperial-era modifiers handled by the age script
  - **17** Age of Revolutions modifiers
- The underlying bonuses are largely carried over; the main change is how and when the game evaluates/applies them.
- Because they are no longer continuously evaluated as triggered modifiers, gaining or losing the conditions for one of these bonuses is now handled through the refresh pulse rather than instant continuous recalculation.

Examples of migrated bonuses include development milestones, country-specific age bonuses, merchant-region bonuses, religious-unity and culture-unification bonuses, and colonial/trade/military/industrial/government-condition bonuses.

#### Colonial range

The early colonial-range redistribution introduced in 3.24 has been reverted.

- **Diplomatic Technology 3** once again grants **+100 colonial range**.
- The extra **+30 colonial range at Diplomatic Technology 5** has been removed.
- The extra **+70 colonial range at Diplomatic Technology 6** has been removed.
- Diplomatic Technology 7 retains its existing **+115 colonial range**.

#### Country renaming

##### Bavaria
Bavaria can now use the country-renaming decision.

New options:
- **Kingdom of Bavaria**
- **K�nigreich Bayern**
- **Volksstaat Bayern**

##### France
New rename options:
- **European Union**
- **Frankish Empire**

##### Mamluks
New rename options:
- **Kemet**
- **Deshret**
- **Heka**
- **Gift of the Nile**
- **Mother of the World**

##### Italy
New rename option:
- **Italia**

Also fixed the adjective for **La Repubblica Italiana** from `Itanian` to `Italian`.

##### Portugal
New rename options:
- **Reino de Portugal**
- **Regnum Portugalliae**
- **Regnum Portugalliae et Algarbiae**

##### Morocco
New rename options:
- **Maghreb al-Aqsa**
- **Marinids**
- **Dar al-Maghrib**

##### Ottomans
The Ottoman/Turkey rename list has been heavily cleaned up.

The custom options now include:
- **OwOman Empire**
- **Ottoman Sultanate**
- **Ottoman Empire**
- **R�m**

Removed rename choices include:
- The Eastern Sun
- Osman
- Osman Sultanate
- Osman Empire
- Turkish Empire
- Turkish Republic
- Republic of Turkey
- Turkey
- Sublime Osman State
- Devlet-i Aliyye-i Osmaniyye
- Devlet-i R�m

#### Technical summary

Between the exact 3.24 and 3.24.2 snapshots, **95 files differ**:

- **88** old triggered-modifier files removed as part of the age-modifier migration.
- `common/event_modifiers/aet_modifiers.txt` expanded with the replacement modifiers.
- `common/scripted_effects/aet_scripted_effects.txt` expanded with the new age refresh/apply logic.
- `common/on_actions/aet_on_actions.txt` updated to refresh those modifiers yearly and on age changes.
- `common/technologies/dip.txt` changed for the colonial-range rollback.
- `decisions/country_rename.txt`, `events/lukat_events.txt`, and `localisation/rename_country_l_english.yml` changed for the rename additions and cleanup.

## v3.24.3 <small>[↑ Back to top](#changelogs)</small>

**Compared against:** 3.24.2  
**3.24.2 commit:** `d10ad43416aa49935f9d5199310bf914bed74df2`  
**3.24.3 commit:** `942912ebe5b050787b96f76ad9af962580cacbcd`

This changelog compares the exact numbered release snapshots of **3.24.2** and **3.24.3**.

#### Core Eyalets

- Fixed **Core Eyalets** so they can now be diplomatically annexed.
- This restores the annexation option that was previously missing for Ottoman Core Eyalet subjects.
- Cleaned up the Eyalet subject-type definitions to avoid redundant empty declarations.

#### Elections
*Note to Reader: This entire Section is wrong but the original version was preserved*
- Fixed ruler generation in one of the republican election paths.
- Election-generated rulers now receive explicit base stats instead of relying on stat-change commands without a defined starting value.
- The **Republican Virtues** path now starts the new ruler at **2/2/2** before applying its +1 ADM / +1 DIP / +1 MIL bonuses.
- The alternate female-ruler branch now creates a **2/2/2** ruler directly.

#### Colonial regions

- Corrected the **Caribbean colonial region** by removing province **481** (Bermuda) from its province list.

## v3.25.1 <small>[↑ Back to top](#changelogs)</small>

**Compared against:** 3.24.3  
**3.24.3 commit:** `942912ebe5b050787b96f76ad9af962580cacbcd`  
**3.25.1 commit:** `6943039d6549c7bc306e85342f6ca3ebe437e1c6`

This changelog compares the exact numbered release snapshots of **3.24.3** and **3.25.1**.

#### Holy Roman Empire overhaul removed

The integrated **Besseres HRR / Holy Roman Empire Expanded** content has been removed from the mod.

#### Dutch elections

The Dutch election event has been substantially rewritten.

- Statist candidates are now generated before the election choice is resolved.
- Candidate generation now uses randomized ADM/DIP/MIL stats rather than the fixed 2/2/2 setup used previously.
- Generated candidates receive +1 to each monarch skill after generation.
- Countries with **Republican Virtues** receive another +1 ADM, +1 DIP and +1 MIL.
- Each monarch skill also has an independent **6.25% chance** to gain another +1.
- The generated Statist candidate is stored and then installed when the Statist option is selected.
- Temporary ruler/heir handling was added so candidate generation can occur without permanently disrupting the country used as temporary scope.

> Note: This explanation is not entirely correct. However it comes close to correct. Monarch pips get randomised as common, clamped to [0, 4] and improved by 1. After that the other steps explained here get applied. This uses a system similar to lottery elections (the last two points).

#### Country renaming

A set of new country-renaming options has been added.

##### Netherlands
- Verenigde Provinci�n der Cara�ben
- Vrije Handelsstaat
- Groot Koopmansrijk
- Verenigde Koopmansstaten

##### Kongo
Kongo can now use the rename-country decision.

New options:
- Kingdom of Kongo
- Christian Realm of Kongo
- Democratic People's Republic of Kongo
- United Kongolese States

##### Switzerland
- Pagonia Unita Alpinorum
- Republik delle Alpes
- Civitatum Raetiae et Noricum

## v3.25.2 <small>[↑ Back to top](#changelogs)</small>

### Bug fixes
- Force Limit buildings apply their buff when they don't exist sometimes ([Example](https://discord.com/channels/1402647007117574164/1427011291104673986/1561095753919631370))


## v4.0.0-rc.1 <small>[↑ Back to top](#changelogs)</small>

### Ideas Rework

- Changed tech cost reduction from ideas to vanilla / 1.5 
- Changed idea cost to vanilla / 1.5
- Slightly reduced ld from tariffs
- Reduced Mana Type Share in Idea Groups to 0.34 from 0.5 
- Increased Free Idea Cost to 6 from 4 

#### Dominions 
Dominions are a new colonial subject type. This is the strongest subject type in the game for the subject, featuring fully unlocked diplomacy (even against overlord / overlord subjects) and strong buffs to the subjects economy. The subject can end the relation at any time, the overlord cannot. 

Subject Modifier
- colonists = 1
- merchants = 1
- trade_range_modifier = 0.25
- global_trade_power = 0.33
- monthly_reform_progress_modifier = 0.25	
- stability_cost_modifier = -0.10
- burghers_loyalty_modifier = 0.10
- burghers_influence_modifier = 0.10

Overlord Modifier 

- stability_cost_modifier = 0.10
- global_foreign_trade_power = 0.05
- trade_efficiency = 0.02
- burghers_loyalty_modifier = 0.02
- burghers_influence_modifier = 0.02

#### Administrative Ideas
- Administrative Councils 
  - Reduced Advisor Cost Reduction from 0.25 to 0.20
- Adaptability 
  - Removed War Taxes Cost

#### Christian Ideas (new idea group)

- Bonus:
  - Backrow Artillery Damage: +10%

- Study of Scripture:
  - Papal Influence: +2
  - Devotion: +0.25
  - Monthly Fervor Increase: +0.25
  - Church Power Modifier: +10%
  - Yearly Patriarch Authority: +0.005

- Inquisition:
  - Global Heretic Missionary Strength: +2%
  - Global Missionary Strength: +2%

- Devoutness:
  - Tolerance of Own Religion: +2

- Work Is Worship:
  - Production Efficiency: +15%

- Spread the Word of God:
  - Global Heathen Missionary Strength: +1%
  - Global Missionary Strength: +1%

- Proselytize the Masses:
  - Missionaries: +1
  - Missionary Maintenance Cost: -33%

- Deus Vult:
  - Casus Belli Against Religious Enemies: Yes

#### Decentralised Ideas (new idea group) 

- Decentralised Ideas:
  - Category: Administrative

- Decentralised Ideas 1:
  - Trade Company Investment Cost: -20%

- Decentralised Ideas 2:
  - Trade Company Governing Cost: -15%

- Decentralised Ideas 3:
  - Global Provincial Trade Power Modifier: +33%

- Decentralised Ideas 4:
  - Minimum Autonomy in Territories: -10%

- Decentralised Ideas 5:
  - Trade Steering: +33%
  - Trade Range: +300

- Decentralised Ideas 6:
  - Mercantilism Cost: -25%
  - Global Foreign Trade Power: +10%

- Decentralised Ideas 7:
  - Reasons to Transfer Trade Power: +25
  - Embargo Efficiency: +25%
  - Allows establishing Trade Protectorates

- Bonus:
  - Free Concentrate Development
  - Liberty Desire on Other Continents: -5

#### Dharmic Ideas (new idea group) 

- Requirements:
  - Must be part of the Dharmic religion group.
  - Cannot have Humanist Ideas or Religious Ideas.
  - Debug mode can bypass the religion requirement.

- Accept Small Religious Differences:
  - Religious Unity: +15%
  - Improve Relations Modifier: +25%

- Open Theological Debate:
  - Missionaries: +1
  - Global Missionary Strength: +3%

- Teachings of Buddha:
  - Idea Cost: -7.5%

- Follow the Gurus:
  - Same Religion Advisor Cost: -15%

- Melting Pot of Cultures:
  - Number of Accepted Cultures: +2
  - Promote Culture Cost: -20%

- The Land Provides:
  - Build Cost: -15%

- Dharmashastra:
  - Governing Capacity Modifier: +10%

- Bonus:
  - Development Cost: -10%

#### Eastern Ideas (new idea group) 

- Requirements:
  - Must be part of the Buddhist religion group.
  - Cannot have Humanist Ideas or Religious Ideas.
  - Debug mode can bypass the religion requirement.

- Harmony Through Conversion:
  - Global Heretic Missionary Strength: +4%

- Defending the Land:
  - Defensiveness: +10%

- Monuments to Heaven:
  - Great Project Upgrade Cost: -10%
  - Great Project Upgrade Time: -10%

- Early Urbanization:
  - Expand Infrastructure Cost: -20%
  - Centralize State Cost: -20%

- Divine Right to Rule:
  - Legitimacy: +1
  - Meritocracy: +0.5
  - Horde Unity: +0.5
  - Republican Tradition: +0.5
  - Prestige Decay: -0.5%

- Counter Western Religion:
  - Missionaries: +1
  - Global Missionary Strength: +2%

- Legalism:
  - State Governing Cost: -15%
  - Yearly Karma Decay: +0.2

- Bonus:
  - Development Cost: -10%

#### Industrial Ideas (replaces eco ideas) 

- Bureaucracy:
  - Global Prosperity Growth: +25%

- National Bank:
  - Global Allowed Number of Buildings: +1

- Merchant Passes:
  - Production Efficiency: +10%

- Efficient Mining:
  - Expand Infrastructure Cost: -15%

- Debt and Loans:
  - State Maintenance Modifier: -15%

- Nationalistic Enthusiasm:
  - Build Cost: -12.5%
  - Build Time: -12.5%

- Smithian Economics:
  - Development from Manufactories: +1

- Bonus:
  - Global Trade Goods Size Modifier: +10%

#### Expansion Ideas

- Bonus:
  - Colony Cost Modifier: -15% → removed
  - Colony Development Boost: +1 → added

- Additional Colonists:
  - Colonists: +1 → unchanged
  - Temporary Colonist removal effect: removed

- Additional Diplomats:
  - Diplomats: +1 → unchanged
  - Envoy Travel Time: -20% → moved here from Vice Roys

- Faster Colonists:
  - Global Colonial Growth: +20 → unchanged

- Vice Roys:
  - Global Tariffs: +10% → removed
  - Envoy Travel Time: -20% → moved to Additional Diplomats
  - Liberty Desire on Other Continents: -5 → -10
  - Trade Company Investment Cost: -5% → added

- General Colonization Law:
  - Colonists: +1 → unchanged
  - Colonist Placement Chance: +5% → unchanged
  - Temporary Colonist removal effect: removed

- Additional Merchants:
  - Merchants: +1 → removed
  - Colony Cost Modifier: -15% → added
  - Minimum Autonomy in Territories: -5% → added

- Competitive Merchants:
  - Global Trade Power: +20% → removed
  - Global Provincial Trade Power Modifier: +25% → added
  - Temporary Colonist removal effect: added

#### Fiscal Ideas (new idea group)

- Fiscal Ideas 1:
  - Embracement Cost: -15%

- Fiscal Ideas 2:
  - Inflation Reduction: +0.1

- Fiscal Ideas 3:
  - Yearly Corruption: -0.1

- Fiscal Ideas 4:
  - Global Tax Modifier: +15%
  - War Taxes Cost Modifier: -100%

- Fiscal Ideas 5:
  - Burghers Influence Modifier: -5%
  - Mercantilism Cost: -25%

- Fiscal Ideas 6:
  - Inflation Action Cost: -25%
  - Gold Depletion Chance Modifier: -33%
  - Monthly Gold Inflation Modifier: -50%

- Fiscal Ideas 7:
  - Interest: -1

- Bonus:
  - Trade Efficiency: +10%

#### Humanist Ideas

- Requirements:
  - `religous_ideas` corrected to `religious_ideas`.

- Bonus:
  - Yearly Harmony: +0.25 → removed.

- Cultural Ties:
  - Promote Culture Cost: -50% → -33%.

- Humanist Tolerance:
  - Global Manpower Modifier: +10% → removed.
  - Manpower in Accepted Culture Provinces: +25% → added.

- Benevolence:
  - Improve Relation Modifier: +50% → +33%.
  - Trade Steering: +15% → added.

- Tolerance Idea:
  - Number of Parliament Issues: 5 → removed.
  - All Power Cost: -2.5% → added.

#### Infrastructure Ideas

- Bonus:
  - Development Cost: -15% → Development Cost Modifier: -5%.

- Organised Construction:
  - Build Cost: -10% → Development Cost: -10%.

- Efficient Construction Plans:
  - Moved to the end of the idea group. Effects unchanged.

- Fort Logistics:
  - Fort Maintenance Modifier: -25% → -20%.
  - Defensiveness: +10% → added.

- Regulation Bureau:
  - Build Time: -25% → -20%.
  - Great Project Upgrade Time: -20% → unchanged.

#### Innovativeness Ideas

- Bonus:
  - Advisor Cost: -35% → -20%.
  - Added conditional advisor cost reductions:
    - Innovativeness > 50: -10%.
    - Innovativeness > 75: -5%.

- Empiricism:
  - Innovativeness Gain: +0.5 → +0.65.

- Scientific Revolution:
  - Embracement Cost: -10% → moved to Print Culture.
  - Technology Cost: -10% → unchanged.

- Print Culture:
  - Embracement Cost: -10% → added.
  - Global Institution Spread: +25% → unchanged.

#### Internal Affair Ideas (new idea group)

- Internal Affair Ideas 1:
  - All Estate Influence Modifier: -5%
  - All Estate Loyalty Equilibrium: +5%

- Internal Affair Ideas 2:
  - Global Autonomy: -5%
  - Minimum Autonomy: -5

- Internal Affair Ideas 3:
  - Prestige Decay: -1%

- Internal Affair Ideas 4:
  - Legitimacy: +1
  - Republican Tradition: +0.5
  - Horde Unity: +1
  - Devotion: +1
  - Meritocracy: +1

- Internal Affair Ideas 5:
  - Global Monthly Devastation: -0.1

- Internal Affair Ideas 6:
  - Local Unrest: -1
  - Free Estate Privilege Revocation: Allowed

- Internal Affair Ideas 7:
  - Great Project Upgrade Cost: -15%
  - Great Project Upgrade Time: -15%

- Bonus:
  - Core Creation Cost: -15%

#### Jewish Ideas (new idea group)

- Requirements:
  - Must be part of the Jewish religion group.
  - Cannot have Humanist Ideas or Religious Ideas.
  - Debug mode can bypass the religion requirement.

- Jewish Ideas 1:
  - Interest: -1

- Jewish Ideas 2:
  - Missionaries: +1
  - Missionary Maintenance Cost: -50%

- Jewish Ideas 3:
  - Prestige per Development from Conversion: +0.10
  - Church Power Modifier: +25%

- Jewish Ideas 4:
  - Land Morale: +7.5%

- Jewish Ideas 5:
  - Tolerance of the True Faith: +3

- Jewish Ideas 6:
  - Global Missionary Strength: +3%

- Jewish Ideas 7:
  - Build Cost: +10%
  - Discipline: +2.5%

- Bonus:
  - Church Loyalty Modifier: +10%

#### Muslim Ideas (new idea group)

- Requirements:
  - Must be part of the Muslim religion group or follow Sikhism.
  - Cannot have Humanist Ideas or Religious Ideas.
  - Debug mode can bypass the religion requirement.

- Jizya:
  - Global Tax Modifier: +10%
  - Tolerance of the True Faith: +1

- Illuminate the Unbelievers:
  - Global Missionary Strength: +4%

- Silk Road Trade:
  - Province Trade Power Modifier: +20%

- Imam Schools:
  - Missionaries: +1
  - Monthly Piety Accelerator: +0.005

- Gate Between East and West:
  - Merchants: +1

- Call Upon the Believers:
  - Manpower in True Faith Provinces: +15%

- Jihad:
  - Casus Belli on Religious Enemies

- Bonus:
  - Core Creation Cost: -10%

#### Religious Ideas

- Requirements:
  - Must be part of the Zoroastrian or Pagan religion group, or follow Shinto.
  - Cannot have Humanist Ideas.
  - Debug mode can bypass the religion requirement.
  - Confucianism is no longer specifically excluded.

- Idea names:
  - All ideas now have `_1` appended to their internal names.

- Inquisition:
  - Papal Influence: +2 → removed.
  - Devotion: +0.25 → removed.
  - Monthly Fervor Increase: +0.25 → removed.
  - Church Power Modifier: +10% → removed.
  - Monthly Piety Accelerator: +0.001 → removed.
  - Yearly Karma Decay: +0.1 → removed.
  - Yearly Doom Reduction: +1 → retained.
  - Yearly Authority: +0.15 → retained.
  - Prestige per Development from Conversion: +0.1 → retained.
  - Yearly Patriarch Authority: +0.005 → removed.

#### Statecraft Ideas (new idea group)

- Statecraft Ideas 1:
  - Stability Cost Modifier: -10%

- Statecraft Ideas 2:
  - Monarch Administrative Power: +1
  - National Focus Years: -5

- Statecraft Ideas 3:
  - Expand Administration Cost: -2.0
  - Centralize State Cost: -25%

- Statecraft Ideas 4:
  - Monthly Reform Progress: +0.25

- Statecraft Ideas 5:
  - Max Absolutism: +10
  - Max Absolutism Effect: +5%

- Statecraft Ideas 6:
  - Imperial Authority: +0.1
  - Imperial Mandate: +0.1
  - Monthly Splendor: +2

- Statecraft Ideas 7:
  - Administrative Efficiency: +1.7%

- Bonus:
  - Free Policy: +1

#### Court Ideas

- Long Echo:
  - Candidate Random Bonus: +1 → added.

- Recognize Hierarchy:
  - All Estate Loyalty Equilibrium: +10% → removed.
  - Estate Interaction Cooldown Modifier: -15% → added here from Palace of Splendor.

- Welcoming Ceremonies:
  - Free Concentrate Development: removed.
  - Autonomy Change Time: -30% → added.
  - Prestige: +2 → +1.

- Tranquil Coordination:
  - Free Estate Privilege Revocation: removed.

- Respected Authority:
  - No changes.

- Palace of Splendor:
  - Estate Interaction Cooldown Modifier: -15% → moved to Recognize Hierarchy.
  - Free Estate Privilege Revocation: added here from Tranquil Coordination.
  - Monthly Splendor: +2 → unchanged.

- Court Embassies:
  - Max Absolutism: +25 → +20.
  - Max Absolutism Effect: +25% → +20%.

- Bonus:
  - Imperial Mandate: +0.2 → +0.15.
  - All other bonus effects unchanged.

#### Diplomatic Ideas

- Foreign Embassies:
  - Diplomatic Advisor Cost: -25% → -20%.

- Cabinet:
  - Improve Relation Modifier: +25% → added.

- Benign Diplomats:
  - Improve Relation Modifier: +25% → removed.
  - Envoy Travel Time: -15% → added.

#### Exploitation Ideas

- Exploitation Ideas 1:
  - Global Tariffs: +25%

- Exploitation Ideas 2:
  - Treasure Fleet Income: +40%
  - Expel Minorities Cost: -40%

- Exploitation Ideas 3:
  - Reduced Liberty Desire: -15 (This means +15 liberty desire in subjects!) 
  - Colonial Subject:
    - Goods Produced: +20%

- Exploitation Ideas 4:
  - Trade Steering: +20%
  - Global Foreign Trade Power: +33%

- Exploitation Ideas 5:
  - Build Cost: -0.1%
  - Unlocks a decision to build in colonial subjects utilizing the combined local construction cost, your own global construction cost, the colonies global construction cost and a 20% bonus on top

- Exploitation Ideas 6:
  - Goods Produced: +0.001
  - Colonial Subject Effect:
    - Goods Produced: +0.2
    - Land Force Limit: -25%
    - Naval Force Limit: -15% 

- Exploitation Ideas 7:
  - Global Provincial Trade Power Modifier: +0.1%
  - Colonial Subject Effect:
    - Global Provincial Trade Power Modifier: +25% 
  - Unlocks a decision to steal 6 months of income of a colony each year, costing liberty desire and applying brutal modifiers to the colony. If liberty desire exceeds 65 during this, colonial nations can jointly revolt with strong buffs. Alternatively the revolt can be stopped by granting them Dominion status

- Bonus:
  - Global Ship Trade Power: +25%
  - Mercantilism Cost: -25%
  - Native Assimilation: +15%

### Elite Guards

- Repurposed Revolutionary Guards as Elite Guards 
 - Base Modifiers: 
   - infantry_power = -2
	- cavalry_power = -2
	- artillery_power = -2
	- drill_gain_modifier = 1
	- shock_damage_received = -0.05
	- fire_damage_received = -0.05
	- land_maintenance_modifier = 0.25
- Provided an API to 'enable' each unit type seperately, and interact with them as if they were three different special units
- Added Custom Modifiers interacting with the entire system:
 - aet_eliteGuards_forceLimit - De Iure Force Limit 
 - aet_eliteGuards_forceLimit_infGfx - gfx helper for ideas
 - aet_eliteGuards_forceLimit_cavGfx - gfx helper for ideas
 - aet_eliteGuards_forceLimit_artyGfx - gfx helper for ideas
 - aet_eliteGuards_forceLimit_infGfx - multiplier of scalable buffs (most of them)
- Added a nobility priviledge scaling with influence
 - while loyal provides reinforce speed and cost (up to 1, -1)
 - while disloyal provides reinforce speed and cost (up to -1, 1) as well as stability cost, land morale and stability cost to declare war (up to 1, -0.10, 2)
- Temporarily removed the GE Elite Guards priviledge and government reform (planned to be restored soon)

#### On Actions

Modifying how Elite Guards work via decisions costs Action Points. Up to 5 Action Points can be stored. You regain one Action Point per year. Currently you have stored `[ROOT.aet_eliteGuards_actions_bank.GetValue]` Action Points.

If you take an action while you are below 0 stored Action Points, it will cost 20 × 2^n Military Power, where `n` is the number of actions you have taken while below 0 stored Action Points. This cost is capped at 600 Military Power.

#### On their force limit

The force limit of Elite Guards is not hard capped, but it is soft capped. The de facto force limit can be changed via the decisions Increase Elite Guards Forcelimit and Decrease Elite Guards Forcelimit. Doing so costs a half action.

Depending on the de facto force limit compared to the Elite Guards Forcelimit, the following modifiers will be applied:

- (-inf; 0.5] — Elite Guards
  - Elite Guards Buff Multiplier: +40%
  - Infantry Cost: -35%
  - Cavalry Cost: -35%
  - Artillery Cost: -35%
  - Land Maintenance: -35%

- (0.5; 0.70] — Elite Guards
  - Elite Guards Buff Multiplier: +30%
  - Infantry Cost: -35%
  - Cavalry Cost: -35%
  - Artillery Cost: -35%
  - Land Maintenance: -35%

- (0.70; 0.80] — Elite Guards
  - Elite Guards Buff Multiplier: +10%

- [1.25; 1.35) — Elite Guards
  - Elite Guards Buff Multiplier: -10%
  - Infantry Cost: +25%
  - Cavalry Cost: +25%
  - Artillery Cost: +25%
  - Land Maintenance: +25%

- [1.35; 1.5) — Elite Guards
  - Elite Guards Buff Multiplier: -30%
  - Infantry Cost: +50%
  - Cavalry Cost: +50%
  - Artillery Cost: +50%
  - Land Maintenance: +50%

- [1.35; 1.5) — Country
  - Land Forcelimit: -5%

- [1.5; 1.75) — Elite Guards
  - Elite Guards Buff Multiplier: -40%
  - Infantry Cost: +50%
  - Cavalry Cost: +50%
  - Artillery Cost: +50%
  - Land Maintenance: +50%

- [1.5; 1.75) — Country
  - Land Forcelimit: -10%

- [1.75; 2) — Elite Guards
  - Elite Guards Buff Multiplier: -50%
  - Infantry Cost: +75%
  - Cavalry Cost: +75%
  - Artillery Cost: +75%
  - Land Maintenance: +75%

- [1.75; 2) — Country
  - Land Forcelimit: -10%
  - Governing Capacity: -25%
  - All Power Cost: +5%

- [2; +inf) — Elite Guards
  - Elite Guards Buff Multiplier: -50%
  - Infantry Cost: +100%
  - Cavalry Cost: +100%
  - Artillery Cost: +100%
  - Land Maintenance: +100%

- [2; +inf) — Country
  - Land Forcelimit: -10%
  - Governing Capacity: -25%
  - All Power Cost: +5%
  - Yearly Corruption: +1
  - Minimum Autonomy: +20

#### On possible Modifiers

##### Constant Payment (damage dealt)

- Unique: `pluto_morale`
- Requirements: Plutocratic Ideas and either Infantry or Artillery must be enabled.
- Morale Damage Dealt: +10%

##### Constant Payment (damage received)

- Unique: `pluto_morale`
- Requirements: Plutocratic Ideas and either Infantry or Artillery must be enabled.
- Morale Damage Received: -10%

##### Integration of Mercenary Bands

- Requirements: Plutocratic Ideas or Mercenary Ideas, and either Infantry or Artillery must be enabled.
- Regiment Manpower Usage: -20%

The cost of these modifiers is:

`num_of_modifiers × (1 + merc_cost_modifier) × (1 + merc_maintenance_modifier) × 0.5` Land Maintenance

##### Offensive Shock

- Unique: `offensive_dealt`
- Requirements: Offensive Ideas and Infantry must be enabled.
- Shock Damage Dealt: +10%
- Reinforcement Cost: +33%
- Land Maintenance: +25%

##### Offensive Fire

- Unique: `offensive_dealt`
- Requirements: Offensive Ideas and Infantry must be enabled.
- Fire Damage Dealt: +10%
- Reinforcement Cost: +33%
- Land Maintenance: +25%

##### Offensive Assault

- Requirements: Offensive Ideas and Infantry must be enabled.
- Assault Fort Ability: +50%
- Reinforcement Cost: +5%

##### Heavy Cavalry Focus

- Unique: `cavalry_focus`
- Requirements: Cavalry must be enabled.
- Elite Guards:
  - Shock Damage: +35%
  - Morale Damage: +35%
  - Fire Damage: -5%
  - Morale Damage Received: -20%
  - Shock Damage Received: -5%
  - Fire Damage Received: -5%
  - Cavalry Cost: +200%
  - Land Maintenance: +100%
  - Recover Army Morale Speed: -35%
  - Reinforce Speed: -75%
- Country:
  - Elite Guards Forcelimit: -7.5%
  - Nobles Influence: +10%

##### Light Cavalry Focus

- Unique: `cavalry_focus`
- Requirements: Cavalry must be enabled.
- Elite Guards:
  - Shock Damage: +10%
  - Cavalry Flanking: +50%
  - Cavalry Cost: -5%
- Country:
  - Cavalry-to-Infantry Ratio: +5%
  - Cavalry Power: +5%
  - Cavalry Cost: -10%

##### Integrate the Cossacks into our Elite Cavalry

- Requirements: Light Cavalry Focus and the Cossacks estate (`estate_cossacks`) must be present.
- Elite Guards:
  - Shock Damage: +2.5%
  - Cavalry Cost: -5%
- Country:
  - Cavalry-to-Infantry Ratio: +2.5%
  - Cavalry Power: +2.5%
  - Cavalry Cost: -5%
  - Allowed Cossack Fraction: -1
  - Elite Guards Forcelimit: +10%

##### Horse Archer Focus

- Unique: `cavalry_focus`
- Requirements: Cavalry must be enabled, and the country must be Horde, East Slavic, Hungarian, Nomad, or Teuton.
- Elite Guards:
  - Cavalry Fire: +50%
  - Fire Damage: +10%
  - Cavalry Flanking: +100%
- Country:
  - Movement Speed: +10%

##### Nomadic Horse Archery Focus

- Requirements: Cavalry must be enabled and the country must have completed the Horde Government Ideas group.
- Elite Guards:
  - Cavalry Fire: +150%
  - Fire Damage: +15%
  - Cavalry Cost: -15%
- Country:
  - Movement Speed: +10%

##### Quantity Focus

- Requirements: Infantry must be enabled and the Quantity Ideas group must be completed.
- Country:
  - Elite Guards Buff Multiplier: -10%
  - Elite Guards Forcelimit: +7.5%

### General Adjustments
- Fixed a bug, where Totemist Ancestors did not apply their buffs properly
- Fixed a bug, where Manpower reductions got applied chained multiplicatively, resulting in a manpower reduction to .25 of vanilla instead of the intended 0.5

#### Buildings
- Added Custom Modifiers for Loc
 - aet_flBuildings_land_forcelimit_from_development
 - aet_flBuildings_land_forcelimit_from_development
- Added Localisation for Land Force Limit Buildings
- Reworked how Land Force Limit Buildings apply their buffs, improving readability and maintainability 
- Applied the same system used with Land Force Limit Buildings to Naval Force Limit Buildings
- Added -5 min_local_autonomy to courthouses
- Added -10 min_local_autonomy to town houses

#### Defines
- Reduced AI drilling budget to 0% of surplus 
- Allowed AI to hire cav mercs
- Increased Merc Company max size to 300 from 80
- Increased Merc Company Army Tradition to 60 from 55 
- Increased Merc Company Base Cost to 15 from 10 
- Increased Merc Company Starting Morale to Vanilla 

#### Crown Land
- Removed crownland bracket [100; 9998]
- Added min_autonomy 30 / 20 / 15 / 10 / 5 / -1 / -2 / -5 / -10 / -20 
- Added dev_cost 0 / 0 / 0 / 0 / 0 / -1 / -2 / -5 / -10 / -10  

#### England 

- Added a Strait from Dover to Calais 
- Added a monument in dover called 'Cliffs of Dover'
 - Can be used by England, having been England, being british or gaelic 
 - Level 1: 
  - local_defender_dice_roll_bonus = 1
  - hostile_disembark_speed = 0.25
  - local_defensiveness = 0.25
  - Region: local_warscore_cost_modifier = 0.5
 - Level 2: 
  - hostile_disembark_speed = 0.50
  - local_defender_dice_roll_bonus = 2
  - Area: local_defensiveness = 0.25
  - Region: local_warscore_cost_modifier = 0.75
  - Calais: local_defensiveness = 0.33
  - Calais: local_assault_fort_ability = -0.75
 - Level 3: 
  - local_defender_dice_roll_bonus = 1
  - hostile_disembark_speed = 0.75
  - hostile_fleet_attrition = 5
  - Area: hostile_disembark_speed = 0.25
  - Area: local_defender_dice_roll_bonus = 1
  - Area: local_defensiveness = 0.33
  - Region: local_warscore_cost_modifier = 1
  - Calais: local_defensiveness = 0.33
  - Calais: local_assault_fort_ability = -0.75
- Added a province tm to Normandy for England providing 7.5% morale of armies while England holds more than 5 provinces being in France or French 
- Added a mercenary company unique to England to balance out French Vassals

#### The Rock of Gibraltar 

Altered the Rock of Gibraltar changing its identity from a defensive monument to a naval monument. 
New Modifiers:
- Tier 1
 - Province
  - hostile_fleet_attrition = 2 
  - blockade_force_required = 0.5 
 - Country 
  - coast_raid_range = 1
  - allowed_galleass_fraction = 0.05
  - allowed_man_of_war_fraction = 0.05
  - allowed_galleon_fraction = 0.05
- Tier 2 
 - Province
  - hostile_fleet_attrition = 5
  - block_slave_raid = yes 
  - local_sailors_modifier = 0.33
 - Area 
  - blockade_force_required = 0.5
 - Country 
  - coast_raid_range = 2
  - allowed_galleass_fraction = 0.10
  - allowed_man_of_war_fraction = 0.10
  - allowed_galleon_fraction = 0.10
- Tier 3 
 - Province 
  - hostile_fleet_attrition = 10
  - local_garrison_size = 0.5
  - local_warscore_cost_modifier = 0.15
 - Area 
  - blockade_force_required = 0.75
  - block_slave_raid = yes
  - local_sailors_modifier = 0.33
 - Country 
  - coast_raid_range = 3
  - number_of_cannons_modifier = 0.05
  - allowed_galleass_fraction = 0.2
  - allowed_man_of_war_fraction = 0.2
  - allowed_galleon_fraction = 0.2
 - Spawns in Ships regardless of them being unlocked to the country   
  - 5 light Man'o wars 
  - 5 heavy Man'o wars
  - 5 heavy Galleons `

#### Hohenzollern Castle 
Opened up the trigger slightly to nations usually having 'von Hohenzollern' dynasty. 

### Development

- Introduced a project documentation system (see the [docs readme](README.md)). To date documentation of legacy content is not yet complete.
- Established formal versioning.
- Changed the versioning model from **commit = version** to **publication = version**.
- Moved changelogs into this file 