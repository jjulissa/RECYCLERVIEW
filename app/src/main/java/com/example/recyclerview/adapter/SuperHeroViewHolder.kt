package com.example.recyclerview.adapter

import android.content.DialogInterface
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view) {
    // ViewHolder,SeLikPintar,Celdas,ChakItemYoNanListLa,LayoutItem.

// (view:View),OuMetelPaskeSeLikPermetLiWeSakNanXML,LayoutLa

    val binding = ItemSuperheroBinding.bind(view)
//    view,SeVistaKeNouTeResevwaAnwoA,NanKlasLa

//    GenerarVariableParaDespuesAccederA,Ellos,
    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)

//findViewById,checheYonVistaPouMwen,MemPasewIdKelGenNanXML,A,
// OuDweDilKiTipoLiYe,<YonnNanYoOuDweMete,TextView,ImageView,Botton,toolBar,etc...>
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
//  superHeroModel: SuperHero, LiPralResevwaToutLisaKiNanAdapterLa,private val superHeroList: List<SuperHero>,


        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
//        Glide, SeYonLibraryKewImplementarPoulKaBawLisSuperHeroYo
//        load, iniciarlisar, prepararlo, para consumirlo
//        into,donde vas a depositar ese imagen
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
//        photo,SeJusYonURL

        binding.ivSuperHero.setOnClickListener {
//            Toast.makeText, para preparar el mensaje
//            Toast.LENGTH_SHORT, el tiempo que va durar el mensaje
//            show , para ejecutarlo, mostrarlo
            Toast.makeText(binding.ivSuperHero.context, superHeroModel.realName, Toast.LENGTH_SHORT).show()
        }
//        binding.ivSuperHero.context
        itemView.setOnClickListener {onClickListener(superHeroModel)}

    }
}