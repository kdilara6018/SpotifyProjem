package com.example.spotifyprojem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.spotifyprojem.databinding.FragmentAnasayfaBinding
import androidx.recyclerview.widget.GridLayoutManager

class AnasayfaFragment : Fragment() {
   private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentAnasayfaBinding.inflate(inflater,container,false)

        val SarkiListesi = ArrayList<Spotify>()
        val f1 = Spotify(1,"2000'ler","sarki")
        val f2 = Spotify(2,"Persian","sarki2")
        val f3 = Spotify(3,"2010'lar","sarki3")
        val f4 = Spotify(4,"Türkiye 2024","sarki4",)
        val f5 = Spotify(5,"Top Hits","sarki5")
        val f6 = Spotify(6,"Latin Hit Mix","sarki6",)
        val f7 = Spotify(7,"2010'lar Mix","sarki7")
        val f8 = Spotify(8,"Radyo Yalın","sarki8")
        val f9 = Spotify(9,"Yol Şarkıları","sarki9")
        val f10 = Spotify(10,"Anadolu Rock","sarki10")
        val f11 = Spotify(11,"80'ler","sarki11")
        val f12 = Spotify(12,"90'lar","sarki12")
        SarkiListesi.add(f1)
        SarkiListesi.add(f2)
        SarkiListesi.add(f3)
        SarkiListesi.add(f4)
        SarkiListesi.add(f5)
        SarkiListesi.add(f6)
        SarkiListesi.add(f7)
        SarkiListesi.add(f8)
        SarkiListesi.add(f9)
        SarkiListesi.add(f10)
        SarkiListesi.add(f11)
        SarkiListesi.add(f12)

        val SpotifyAdapter=SpotifyAdapter(requireContext(),SarkiListesi)
        binding.spotifyRv.adapter=SpotifyAdapter
        binding.spotifyRv.layoutManager = GridLayoutManager(requireContext(), 2)


        return binding.root    }

    }
