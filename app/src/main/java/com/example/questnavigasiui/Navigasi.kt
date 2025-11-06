package com.example.questnavigasiui


enum class Navigasi {
    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    scaffold {
        isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.Formulirku.name){
                FormIsian (
                    
                )
            }

        }
    }

}
)