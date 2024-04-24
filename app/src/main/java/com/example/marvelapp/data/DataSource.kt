package com.example.marvelapp.data

import com.example.marvelapp.model.Superheroe

class DataSource() {
    fun getSuperHeroes():MutableList<Superheroe> {
        var superheroes: MutableList<Superheroe> = mutableListOf()
        superheroes.add(Superheroe("Spiderman", "Marvel", "Peter Parker", "https://jacobinlat.com/wp-content/uploads/2022/01/nowayhome-1024x580.jpeg.webp"))
        superheroes.add(Superheroe("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2016/11/daredevil-serie-tv-cartel.jpg?tf=384x"))
        superheroes.add(Superheroe("Wolverine", "Marvel", "James Howlett", "https://lumiere-a.akamaihd.net/v1/images/the_wolverine_-_feature_71479c84.png?region=193,0,614,614"))
        superheroes.add(Superheroe("Batman", "DC", "Bruce Wayne", "https://cdn.forbes.com.mx/2020/03/Batman-.jpg"))
        superheroes.add(Superheroe("Thor", "Marvel", "Thor Odinson", "https://depor.com/resizer/gPemqZqIsG3-UUdg1bTvlo7PKGo=/1200x900/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/TTWV2D3NJBF6XF4ZDWZ5KHBGCY.jpg"))
        superheroes.add(Superheroe("Flash", "DC", "Jay Garrick", "https://img.asmedia.epimg.net/resizer/v2/MEXLM7QJJFCZTOSQ32EC3HODSE.jpg?auth=339ff9fdec4d4b522e83a8a26202037edf6afcd46fca3fcc25b7e94a99583d7a&width=1472&height=828&smart=true"))
        superheroes.add(Superheroe("Green Lantern", "DC", "Alan Scott", "https://i.pinimg.com/originals/27/2f/6b/272f6b5c446ad3f97ed8a531499b76e6.jpg"))
        superheroes.add(Superheroe("Wonder Woman", "DC", "Princess Diana", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTB4wacH75UxBGD6cbKdz9HWvHDKg5b0KafUgGFU6mxqeTm33-aiju1X5Bf00ioelLbdaw&usqp=CAU"))
        return superheroes
    }
}