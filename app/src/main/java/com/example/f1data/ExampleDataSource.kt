package com.example.f1data

import com.example.f1data.models.FormulaOne

class ExampleDataSource {

    companion object {

        fun createDataSet() : ArrayList<FormulaOne> {

            val list = ArrayList<FormulaOne>()

            list.add(
                FormulaOne(
                "Max Verstappen",
                "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/2col/image.png"
                )
            )
            list.add(
                FormulaOne(
                    "Sergio Perez",
                    "https://www.formula1.com/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/2col/image.png"
                )
            )
            list.add(
                FormulaOne(
                    "Charles Leclerc",
                    "https://www.formula1.com/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/2col/image.png"
                )
            )
            list.add(
                FormulaOne(
                    "Carlos Sainz",
                    "https://www.formula1.com/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/2col/image.png"
                )
            )

            return list
        }

    }

}