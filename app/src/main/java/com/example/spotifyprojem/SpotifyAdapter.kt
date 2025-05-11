package com.example.spotifyprojem

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.spotifyprojem.databinding.CardTasarimBinding
import com.example.spotifyprojem.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar
class SpotifyAdapter  (var mContext: Context, var SarkiListesi: List<Spotify>)
        : RecyclerView.Adapter<SpotifyAdapter.CardTasarimTutucu>(){

        inner class CardTasarimTutucu(var tasarim :CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
            var binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
            return CardTasarimTutucu(binding)
        }

        override fun getItemCount(): Int {
            return SarkiListesi.size
        }

        override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
            val sarki = SarkiListesi.get(position)
            val t = holder.tasarim
            t.textViewSarki.text="${sarki.ad}"
            t.imageViewSarki.setImageResource(
                mContext.resources.getIdentifier(sarki.resim,"drawable",mContext.packageName)

            )

            t.cardViewSarki.setOnClickListener {
                val gecis = AnasayfaFragmentDirections.gecisFragment(sarkiNesnesi = sarki)
                Navigation.findNavController(it).navigate(gecis)

            }
        }

    }
