package uz.mlsoft.travelmyappinfo.country_mvp

import uz.mlsoft.travelmyappinfo.data.DataCountry

interface CountryContract {
    interface Model {
        fun getCountries(): ArrayList<DataCountry>
        fun getAll(): ArrayList<DataCountry>
    }

    interface Presenter {
        fun search()
        fun showAll()
        fun openNextActivity()
    }

    interface View {
        fun getClickItemIndex(): String
        fun getEditText(): String
        fun showSearchResult(array: ArrayList<DataCountry>)
        fun show(array: ArrayList<DataCountry>)
        fun openItemActivity(itemCountry: DataCountry)
    }
}