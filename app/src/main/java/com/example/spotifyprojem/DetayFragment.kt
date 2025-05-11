package com.example.spotifyprojem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.spotifyprojem.databinding.FragmentAnasayfaBinding

import com.example.spotifyprojem.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

private lateinit var binding : FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding = FragmentDetayBinding.inflate(inflater,container,false)
        val bundle:DetayFragmentArgs by navArgs()
        val sarki = bundle.sarkiNesnesi // Spotify tipinde

        binding.toolbarDetay.title=sarki.ad
        binding.tvSarkiAdi.text="${sarki.ad}"
        binding.ivSpoti.setImageResource(
            resources.getIdentifier(sarki.resim,"drawable",requireContext().packageName)

        )
        return binding.root
    }
}


