USE [skyblock]

GO

/****** Object:  Table [dbo].[items]    Script Date: 1/10/2021 7:29:48 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[items](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[damage] [float] NULL,
	[crit_chance] [float] NULL,
	[crti_damage] [float] NULL,
	[strength] [float] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

-- Build insert statements
-- select 'insert into items (name, damage, strength) values (''' + name + ''',' + convert(varchar(50), damage) + ',' + convert(varchar(50),strength) +')' from items
-- where strength is not null

insert into items (name, damage, strength) values ('Aspect of the end',100,100)
insert into items (name, damage, strength) values ('Aspect of the dragons',225,100)
insert into items (name, damage, strength) values ('Astraea',200,150)
insert into items (name, damage, strength) values ('Cleaver',40,10)
insert into items (name, damage, strength) values ('Conjuring',68,36)
insert into items (name, damage, strength) values ('Crypt witherlord sword',62,50)
insert into items (name, damage, strength) values ('Dreadlord sword',52,50)
insert into items (name, damage, strength) values ('Edible mace',125,25)
insert into items (name, damage, strength) values ('ember rod',80,35)
insert into items (name, damage, strength) values ('End stone sword',120,80)
insert into items (name, damage, strength) values ('Fel Sword',190,135)
insert into items (name, damage, strength) values ('Flaming Sword',50,20)
insert into items (name, damage, strength) values ('Florid Zombie Sword',150,80)
insert into items (name, damage, strength) values ('Ghoul Buster',140,90)
insert into items (name, damage, strength) values ('Giant Cleaver',170,60)
insert into items (name, damage, strength) values ('Golem Sword',80,125)
insert into items (name, damage, strength) values ('Hyper Cleaver',145,50)
insert into items (name, damage, strength) values ('Hyperion',293,150)
insert into items (name, damage, strength) values ('Ink wand',130,90)
insert into items (name, damage, strength) values ('Leaping Sword',150,100)
insert into items (name, damage, strength) values ('Livid dagger',210,60)
insert into items (name, damage, strength) values ('Midas staff',130,150)
insert into items (name, damage, strength) values ('Midas Sword',270,120)
insert into items (name, damage, strength) values ('Necromancer sword',250,125)
insert into items (name, damage, strength) values ('necrons blade',260,110)
insert into items (name, damage, strength) values ('ornate zombie sword',110,60)
insert into items (name, damage, strength) values ('pigman sword',200,100)
insert into items (name, damage, strength) values ('pooch sword',120,20)
insert into items (name, damage, strength) values ('prismarine blade',50,25)
insert into items (name, damage, strength) values ('raider axe',80,50)
insert into items (name, damage, strength) values ('reaper falchion',120,100)
insert into items (name, damage, strength) values ('recluse fang',120,30)
insert into items (name, damage, strength) values ('revenant falchion',90,50)
insert into items (name, damage, strength) values ('scorpion foil',100,100)
insert into items (name, damage, strength) values ('scylla',260,150)
insert into items (name, damage, strength) values ('shadow fury',300,125)
insert into items (name, damage, strength) values ('shaman sword',100,20)
insert into items (name, damage, strength) values ('silent death',130,50)
insert into items (name, damage, strength) values ('silk edge sword',175,125)
insert into items (name, damage, strength) values ('spirit sword',210,50)
insert into items (name, damage, strength) values ('super cleaver',85,20)
insert into items (name, damage, strength) values ('sword of revelations',180,50)
insert into items (name, damage, strength) values ('tacticianss sword',200,100)
insert into items (name, damage, strength) values ('Valkyrie',270,120)
insert into items (name, damage, strength) values ('Yeti Sword',150,170)
insert into items (name, damage, strength) values ('Zombie commander whip',65,5)
insert into items (name, damage, strength) values ('zombie knight sword',82,21)
insert into items (name, damage, strength) values ('zombie soldier cutlass',52,26)
insert into items (name, damage, strength) values ('zombie sword',100,50)

