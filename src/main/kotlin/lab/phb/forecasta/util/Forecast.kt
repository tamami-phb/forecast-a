package lab.phb.forecasta.util

import lab.phb.forecasta.model.Resume

class Forecast {

    companion object {
        fun calculateLeastSquare(data: List<Resume>): Double {
            var a = calculateA(data)
            var b = calculateB(data)
            var x = getXAkhir(data.size)
            return a + (b * x)
        }

        fun getXAkhir(n: Int): Int {
            if(n % 2 == 0) {
                return n+1
            } else {
                return (n+1)/2
            }
        }

        fun calculateB(data: List<Resume>): Double {
            var n = data.size
            var listX = generateX(n)
            var jumlahX2 = sumX2(listX)
            var jumlahXY = sumXY(listX, data)

            return jumlahXY / jumlahX2
        }

        fun sumXY(listX: List<Int>, data: List<Resume>): Double {
            var result = 0.0
            for(i in 0..listX.size - 1) {
                result += listX.get(i) * data.get(i).total
            }
            return result
        }

        fun sumX2(data: List<Int>): Int {
            var result = 0
            data.forEach {
                result += it * it
            }
            return result
        }

        fun generateX(n: Int): List<Int> {
            var result = mutableListOf<Int>()
            if(n % 2 == 0) {
                // TODO: generate list x genap
                var xAwal = (n-1).unaryMinus()
                for(i in 0..n-1) {
                    result.add(xAwal)
                    xAwal += 2
                }
            } else {
                // TODO: generate list x ganjil
                var xAwal = ((n-1) / 2).unaryMinus()
                for(i in 0..n-1) {
                    result.add(xAwal++)
                }
            }
            return result
        }

        fun calculateA(data: List<Resume>): Double {
            var n = data.size
            var totalY = 0.0
            data.forEach {
                totalY += it.total
            }
            return totalY / n
        }
    }

}