package com.mshdabiola.network.request

import io.ktor.resources.Resource

@Resource("w/api.php?action=query&format=json&formatversion=2")
class WikiAPI {
    @Resource(
        "/w/api.php?action=query&format=json&formatversion=2&generator=" +
            "search&prop=description|pageimages&piprop=thumbnail&pithumbsize=" +
            "70&gsrnamespace=14",
    )
    data class SearchCategory(
        val gsrsearch: String?,
        val gsrlimit: Int,
        val gsroffset: Int,
    )
}

//
// interface CategoryInterface {
//    /**
//     * Searches for categories with the specified name.
//     *
//     * @param filter    The string to be searched
//     * @param itemLimit How many results are returned
//     * @return
//     */
//    @GET("w/api.php?action=query&format=json&formatversion=2&generator=search&prop=description|pageimages&piprop=thumbnail&pithumbsize=70&gsrnamespace=14")
//    fun searchCategories(
//        @Query("gsrsearch") filter: String?,
//        @Query("gsrlimit") itemLimit: Int,
//        @Query("gsroffset") offset: Int,
//    ): Single<MwQueryResponse>
//
//    /**
//     * Searches for categories starting with the specified prefix.
//     *
//     * @param prefix    The string to be searched
//     * @param itemLimit How many results are returned
//     * @return
//     */
//    @GET("w/api.php?action=query&format=json&formatversion=2&generator=allcategories&prop=categoryinfo|description|pageimages&piprop=thumbnail&pithumbsize=70")
//    fun searchCategoriesForPrefix(
//        @Query("gacprefix") prefix: String?,
//        @Query("gaclimit") itemLimit: Int,
//        @Query("gacoffset") offset: Int,
//    ): Single<MwQueryResponse>
//
//    /**
//     * Fetches categories starting and ending with a specified name.
//     *
//     * @param startingCategory Name of the category to start
//     * @param endingCategory Name of the category to end
//     * @param itemLimit How many categories to return
//     * @param offset offset
//     * @return MwQueryResponse
//     */
//    @GET("w/api.php?action=query&format=json&formatversion=2&generator=allcategories&prop=categoryinfo|description|pageimages&piprop=thumbnail&pithumbsize=70")
//    fun getCategoriesByName(
//        @Query("gacfrom") startingCategory: String?,
//        @Query("gacto") endingCategory: String?,
//        @Query("gaclimit") itemLimit: Int,
//        @Query("gacoffset") offset: Int,
//    ): Single<MwQueryResponse>
//
//    @GET("w/api.php?action=query&format=json&formatversion=2&generator=categorymembers&gcmtype=subcat&prop=info&gcmlimit=50")
//    fun getSubCategoryList(
//        @Query("gcmtitle") categoryName: String,
//        @QueryMap(encoded = true) continuation: Map<String, String>,
//    ): Single<MwQueryResponse>
//
//    @GET("w/api.php?action=query&format=json&formatversion=2&generator=categories&prop=info&gcllimit=50")
//    fun getParentCategoryList(
//        @Query("titles") categoryName: String?,
//        @QueryMap(encoded = true) continuation: Map<String, String>,
//    ): Single<MwQueryResponse>
//
//    @GET("w/api.php?action=query&format=json&prop=description&formatversion=2")
//    fun getCategoryDescription(
//        @Query("titles") categoryName: String?,
//    ): Single<MwQueryResponse>
//
// }
