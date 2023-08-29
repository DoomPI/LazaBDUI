object ProjectModules {

    object Common {
        private const val common = ":common"
        const val screen = "$common:screen"
    }

    object Feature {
        private const val feature = ":feature"
        const val product = "$feature:product-feature"
    }
}