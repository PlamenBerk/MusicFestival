package music;

import java.io.IOException;
import java.util.Scanner;

import musicFestival.Act;
import musicFestival.Group;
import musicFestival.Musicplayer;
import musicFestival.Song;
import musicFestival.Vocal;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AudioStream as = null;

		Act act1 = new Act("First act", 22, 23, 2);
		Act act2 = new Act("Second act", 10, 12, 1);

		Vocal geri = new Vocal("GeryNikol", 18);
		Vocal pavaroti = new Vocal("Pavaroti", 90);
		Vocal james = new Vocal("James Alan Hetfield", 55);

		Musicplayer musicplayer1 = new Musicplayer("Na Geri producenta", 33, "Computer");
		Musicplayer musicplayer2 = new Musicplayer("Na Pavaroti muzikanta", 34, "Cigulka");
		Musicplayer musicplayer3 = new Musicplayer("Lars Ulrich", 55, "Barabani");
		Musicplayer musicplayer4 = new Musicplayer("Kirk Lee Hammett", 38, "Kitara");

		Song songG = new Song("Napravo gi ubivam", "Better listen");
		Song songP = new Song("La Traviata", "Better listen");
		Song songM = new Song("Nothing Else Matters", "Better listen");

		Group group1 = new Group("Nenormalnata grupa", 2, 2, 2);
		Group group2 = new Group(2, "InstrumentalGroup", 2);
		Group group3 = new Group("Metalica", 1, 1, 2);

		group1.musicplayers[0] = musicplayer1;
		group1.musicplayers[1] = musicplayer2;
		group1.songs[0] = songG;
		group1.songs[1] = songP;
		group1.vocalsInGroup[0] = geri;
		group1.vocalsInGroup[1] = pavaroti;

		group2.musicplayers[0] = musicplayer2;
		group2.songs[0] = songP;
		group2.musicplayers[1] = musicplayer1;
		group2.songs[1] = songG;

		group3.musicplayers[0] = musicplayer3;
		group3.musicplayers[1] = musicplayer4;
		group3.vocalsInGroup[0] = james;
		group3.songs[0] = songM;

		act1.groups[0] = group1;
		act1.groups[1] = group2;
		act2.groups[0] = group3;

		Act.actsInfo(act1);

		System.out.println();

		Act.actsInfo(act2);

		System.out.println("Would you like to listen any of songs in groupS (y/n)");
		char c = sc.nextLine().charAt(0);

		switch (c) {
		case 'y':
			for (;;) {
				boolean flag = false;
				System.out.println("MENU: (press 'b' for exit)");
				System.out.println("1." + act1.groups[0].songs[0].getTitle());
				System.out.println("2." + act1.groups[1].songs[1].getTitle() + " (instrumental)");
				System.out.println("3." + act1.groups[0].songs[1].getTitle());
				System.out.println("4." + act1.groups[1].songs[0].getTitle() + " (instrumental)");
				System.out.println("5." + act2.groups[0].songs[0].getTitle());
				System.out.println("6." + act2.groups[0].songs[0].getTitle() + " (instrumental)");
				char c1 = sc.nextLine().charAt(0);

				switch (c1) {
				case 'b':
					AudioPlayer.player.stop(as);
					flag = true;
					break;
				case '1':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/GeryNikol.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				case '2':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/instGeri.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				case '3':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/Pavarotti.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				case '4':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/instrPav.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				case '5':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/Metallica-Nothing.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				case '6':
					AudioPlayer.player.stop(as);
					try {
						as = new AudioStream(Main.class.getResourceAsStream("/Metallica-Instrumental.wav"));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
					AudioPlayer.player.start(as);
					continue;

				default:
					AudioPlayer.player.stop(as);
					continue;
				}
				if (flag) {
					break;
				}
			}
			break;
		case 'n':
			System.out.println(" :( ok.. bye!");
			break;
		default:
			System.out.println("Watch this kayboard ! :D ");
			break;
		}

	}

}
