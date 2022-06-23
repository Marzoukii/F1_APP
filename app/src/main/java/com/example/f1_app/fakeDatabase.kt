package com.example.f1_app

import com.example.f1_app.model.Pilote

class fakeDatabase {
         val ListPilotes = listOf<Pilote>(
            Pilote(
                1,
                R.drawable.f1,
                "Max Verstappen",
                "Red Bull Racing Honda"
            ),
            Pilote(
                2,
                R.drawable.f2,
                "Lewis Hamilton",
                "Mercedes"
            ),
            Pilote(
                3,
                R.drawable.f3,
                "Valtteri Bottas",
                "Mercedes"
            ),
            Pilote(
                4,
                R.drawable.f4,
                "Carlos Sainz",
                "Ferrari"
            ),
            Pilote(
                5,
                R.drawable.f5,
                "Lando Norris",
                "Mclaren Mercedes"
            ),
            Pilote(
                6,
                R.drawable.f6,
                "Lando Norris",
                "Mclaren Mercedes"
            ),
            Pilote(
                7,
                R.drawable.f7,
                "Charles Leclerc",
                "Ferrari"
            ),
            Pilote(
                8,
                R.drawable.f8,
                "Daniel Ricciardo",
                "Mclaren Mercedes"
            ),
            Pilote(
                9,
                R.drawable.f9,
                "Pierre Gasly",
                "Alphatauri Honda"
            ),
            Pilote(
                10,
                R.drawable.f10,
                "Fernando Alonso",
                "Alpine Renault"
            )
        )


@JvmName("getListPilotes1")
fun getListPilotes() : List<Pilote> {
        return ListPilotes
    }

}