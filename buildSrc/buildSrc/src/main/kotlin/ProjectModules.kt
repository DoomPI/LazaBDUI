object ProjectModules {

    object Common {
        private const val common = ":common"
        const val screen = "$common:screen"
    }

    object Feature {
        private const val feature = ":feature"
        const val auth = "$feature:auth-feature"
        const val bottomButton = "$feature:bottom-button-feature"
        const val product = "$feature:product-feature"
    }
}