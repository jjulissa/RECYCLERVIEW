package com.example.recyclerview.adapter

import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

class SuperHeroAdapter(

//AnndanParantezSaOuDwePaselMeToutSaKlasLaPralResevwa

    private val superHeroList: List<SuperHero>,
    private val onClickListener:(SuperHero) -> Unit)
    : RecyclerView.Adapter<SuperHeroViewHolder>() {
    // Adapter,SeLikAlChecheInformacionYoPouOu,LalMeteYoNanRecyclerView.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
//        FonksyonSaJusApDelvolverOu,NanKlasSuperHeroViewHolder,SawTeKreyeNanXML,
    //        Ex:OuKreyeTextViewNanXML,FonksyonSaPermetOu,UsuarioWelNanKlasSuperHeroViewHolder.kt(PackageAdaper),KewGenAn
            val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

//    override fun onBindViewHolder(holder: SuperHeroAdapter, position: Int) {
//
//        FonksyonSaApPaseNanChakItemYo,LapReleFonksyonRenderLa,
    //        kiNanKlasSuperHeroViewHolder,lapPasel,ItemYo
//        Item,seSawKreyeNan XML(RecycleView,TextView,ImageView,etc...)
//        val item = superHeroList[position]
//        holder.render(item)
//    }

    override fun getItemCount(): Int {
//        FonksyonSaDweDevolverElTamanoDeLaLista
//        superHeroList.size
//        Size,SeJusKantiteA,LiKalkulePouOu
        return superHeroList.size
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
//OuDweFeKlasViewHolderLaAvan,OuTocarFonksyonSa.

        val item = superHeroList[position]
        holder.render(item, onClickListener)
    }
}